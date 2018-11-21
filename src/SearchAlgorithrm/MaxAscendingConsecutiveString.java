package SearchAlgorithrm;

public class MaxAscendingConsecutiveString {
    public static void main(String[] args) {
        String string = "abcabcdgabuvxy";
        System.out.println(findAscendingString(string,1));
    }
    public static String findAscendingString (String string,int index){
        char[] arr = string.toCharArray();
        int i = index;
        while ((i < arr.length) && (arr[i] > arr[i - 1])){
            i++;
        }
        String tempString = string.substring(index - 1,i);
        if (i == arr.length) return tempString;
        index = i + 1;
        String comparableString = findAscendingString(string,index);
        if (tempString.length() < comparableString.length()){
            return comparableString;
        }else {
            return tempString;
        }

    }
}
