package Sort;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class SmallestWindowString {
    public static void main(String[] args) {
        String string = "welcome to w3resource";
        String subString = "tower";
        Character[] indexOfSubString = new Character[string.length()];
        char[] charsOfString = string.toCharArray();;

        char[] charsOfSubString = subString.toCharArray();
        for (int i = 0; i < charsOfSubString.length; i++) {
            for (int j = 0; j < charsOfString.length; j++) {
                if (charsOfSubString[i] == charsOfString[j]){
                     indexOfSubString[j] = charsOfString[j];
                }
            }
        }

        // get the first index
        int length = subString.length(), count = 0,index = -1,indexOfLast = 0;
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
            index++;
            for (int i = index; i < indexOfSubString.length; i++) {
                if (indexOfSubString[i] != null){
                    result[count] = indexOfSubString[i];
                    count ++;
                }
                if (count == length){
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
                for (int i = index; i < indexOfSubString.length; i++) {
                    if (indexOfSubString[i] != null){
                        count--;
                    }
                    if (count == 0) {
                        indexOfLast = i;
                        break;
                    }
                }
                break;
            }
            if (result[result.length - 1] == charsOfString[indexOfLast]) {
                length++;
            }
        }
        for (int i = indexOfLast - length; i <= indexOfLast ; i++) {
            System.out.print(charsOfString[i]);
        }
    }
}
