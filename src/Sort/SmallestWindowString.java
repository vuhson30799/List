package Sort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SmallestWindowString {
    public static void main(String[] args) {
        String string = "welcome to w3resource";
        String subString = "tower";
        Character[] indexOfSubString = new Character[string.length()];

        char[] charsOfString = string.toCharArray();

        char[] charsOfSubString = subString.toCharArray();
        Map<Integer,Character> map = new LinkedHashMap<>();
        for (int i = 0; i < charsOfSubString.length; i++) {
            for (int j = 0; j < charsOfString.length; j++) {
                if (charsOfSubString[i] == charsOfString[j]){
//                    indexOfSubString[j] = charsOfString[j];
                    map.put(j,charsOfString[j]);
                }
            }
        }
        Set<Map.Entry<Integer, Character>> indexs = map.entrySet();

        // get the first index
        int length = subString.length(), count = 0,index = 0,indexOfLast = 0;
        boolean check = false;
        for (int i = 0; i < indexOfSubString.length; i++) {
            if (indexOfSubString[i] != null){
                index = i;
                break;
            }
        }

        //get the last index
        for (int i = indexOfSubString.length - 1; i >= 0; i--) {
            if (indexOfSubString[i] != null){
                indexOfLast = i;
                break;
            }
        }
        char[] result;
        while (length <= string.length()){
            result = new char[length];
            count = 0;
            for (int i = index; i < indexOfSubString.length; i++) {
                if (indexOfSubString[i] != null){
                    result[count] = indexOfSubString[i];
                    count ++;
                }
                if (count == length){
                    index ++;
                    break;
                }
            }
            for (int i = 0; i < subString.length(); i++) {
                check = false;
                for (int j = 0; j < result.length; j++) {
                    if (charsOfSubString[i] == result[j]){
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    check = false;
                    break;
                }
            }
            if (check) {

            }
            if (result[result.length - 1] == charsOfString[indexOfLast]) {
                length++;
            }
        }

    }
}
