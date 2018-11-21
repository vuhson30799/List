package Sort;


import javax.print.DocFlavor;
import java.util.LinkedList;

public class SmallestWindowString {
    public static void main(String[] args) {
        String string = "welcome to w3resource";
        String subString = "tower";

        LinkedList<Integer> indexOfSubString = new LinkedList<>();

        char[] charsOfString = string.toCharArray();

        char[] charsOfSubString = subString.toCharArray();

        Integer[] indexOfCharacter = new Integer[charsOfString.length];


        for (int i = 0; i < charsOfSubString.length; i++) {
            for (int j = 0; j < charsOfString.length; j++) {
                if (charsOfSubString[i] == charsOfString[j]){
                     indexOfCharacter[j] = j;
                }
            }
        }


        for (int i = 0; i < indexOfCharacter.length; i++) {
            if (indexOfCharacter[i] != null){
                indexOfSubString.add(indexOfCharacter[i]);
            }
        }


        int length = subString.length(),index = -1,indexOfLast = 0;
        boolean check = false;


        while (length <= string.length()){
            index++;
            indexOfLast = index + charsOfSubString.length - 1;
            if (index > indexOfSubString.size() - charsOfSubString.length) {
                length++;
                index = -1;
                continue;
            }
            if (indexOfSubString.get(indexOfLast) - indexOfSubString.get(index) + 1> length){
                continue;
            }
            for (int i = 0; i < subString.length(); i++) {
                check = false;
                for (int j = index; j <= indexOfLast; j++) {
                    if (charsOfSubString[i] == charsOfString[indexOfSubString.get(j)]){
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
                break;
            }
        }


        for (int i = indexOfSubString.get(index); i <= indexOfSubString.get(indexOfLast) ; i++) {
            System.out.print(charsOfString[i]);
        }
    }
}
