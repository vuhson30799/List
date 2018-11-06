package Stack;

import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        System.out.println(convertBitToDecimal("1111.101"));
        System.out.println(convertDecToBit(7.625));
    }


    public static double convertBitToDecimal (String string){
        char[] arr = string.toCharArray();
        double result = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '.'){
                index = -(arr.length - i - 1);
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] != '.'){
                result += ((int)(arr[i]) - 48) * Math.pow(2,index);
                index++;
            }

        }
       return result;
    }


    public static String convertDecToBit (double num) {
        Stack<String> integerStack = new Stack<>();
        Stack<String> decimalStack = new Stack<>();
        int intPart = 0;
        while (num > 1){
            intPart ++;
            num --;
        }
        int doing = 10;
        while ((doing >=0) && num != 0){
            num *= 2;
            if (num >= 1){
                decimalStack.push("1");
                num--;
            }else {
                decimalStack.push("0");
            }
            doing--;
        }
        while (intPart !=0){
            if (intPart % 2 == 1) {
                integerStack.push("1");
            }else {
                integerStack.push("0");
            }
            intPart /= 2;
        }
        StringBuilder result = new StringBuilder();
        while (!integerStack.isEmpty()){
            result.append(integerStack.pop());
        }
        result.append('.');
        while (!decimalStack.isEmpty()){
            result.append(decimalStack.pop());
        }
        return result.toString();
    }

    public static String convertDecToHex (double num) {
        return "";
    }
}
