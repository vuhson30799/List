package Map;

import java.util.TreeMap;

public class RepeatCharInString {
    public static void main(String[] args) {
        String string = "lop chung minh rat rat vui anh em ta chan hoa tinh than";
        System.out.println("Number of character by map:");
        getNumberOfRepeatCharsByMap(string);
        System.out.println("Number of character by new object");
        getNumberOfRepeatCharsByCreateNewObject(string);
    }

    public static void getNumberOfRepeatCharsByMap (String string){
        TreeMap<Character,Integer> charsInString = new TreeMap<>();
        char[] chars = string.toCharArray();
        int count;
        for (int i = 0; i < string.length(); i++) {
            charsInString.putIfAbsent(chars[i],0);
        }
        for (int i = 0; i < string.length(); i++) {
            count = charsInString.get(chars[i]);
            charsInString.put(chars[i],++count);
        }
        System.out.println(charsInString);
    }

    public static void getNumberOfRepeatCharsByCreateNewObject (String string) {
        class Element {
            char key;
            int value;
            Element (char key, int value){
                this.key = key;
                this.value = value;
            }
        }
        char[] chars = string.toCharArray();
        Element[] elements = new Element[chars.length];
        int indexOfElement = 0, indexOfChar = 0;
        boolean isElementExist;

        // count the number of each char
        for (int i = 0; i < chars.length; i++) {
            isElementExist = false;
            for (int j = 0; j < indexOfElement; j++) {
                if (chars[i] == elements[j].key) {
                    isElementExist = true;
                    indexOfChar = j;
                    break;
                }
            }
            if (isElementExist) {
                elements[indexOfChar].value++;
            }else {
                elements[indexOfElement++] = new Element(chars[i], 1);
            }
        }

        // Rearrange array in ascending
        Element temp;
        for (int i = 0; i < indexOfElement - 1; i++) {
            for (int j = i + 1; j < indexOfElement; j++) {
                if (elements[i].key > elements[j].key) {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }

        for (int i = 0; i < indexOfElement; i++) {
            System.out.println("Key " + elements[i].key + " : " + elements[i].value);
        }

    }
}
