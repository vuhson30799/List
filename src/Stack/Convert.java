package Stack;

import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        System.out.println(convertBitToDecimal("1111.101"));
        System.out.println(convertDecToBit(7.025));
        System.out.println(convertDecToHex(18.5));
        System.out.println(convertHexToDecimal("12.8"));
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
        Stack<String> reverseDecimalStack = new Stack<>();
        while (!decimalStack.isEmpty()){
            reverseDecimalStack.push(decimalStack.pop());
        }
        while (!reverseDecimalStack.isEmpty()){
            result.append(reverseDecimalStack.pop());
        }
        return result.toString();
    }


    public static String convertDecToHex (double num) {
        Stack<String> integerPart = new Stack<>();
        Stack<String> decimalPart = new Stack<>();
        int intPart = 0;
        while (num >= 1){
            intPart ++;
                num --;
        }
        while (intPart != 0){
            if (intPart % 16 >= 10){
               integerPart.push((char)(intPart % 16 + 55) + "");
            }else{
                integerPart.push((char)(intPart % 16 + 48) + "");
            }
            intPart /= 16;
        }
        int doing = 10;
        while ((doing >0) && num != 0){
            num *= 16;
            long roundNum = Math.round(num);
            if (roundNum >= 10){
                if (roundNum > num){
                    decimalPart.push((char)(roundNum - 1 + 55) + "");
                    num -= --roundNum;
                }else{
                    decimalPart.push((char)(roundNum +55) + "");
                    num -= roundNum;
                }
            }else {
                if (roundNum > num){
                    decimalPart.push((char)(roundNum - 1 + 48) + "");
                    num -= --roundNum;
                }else{
                    decimalPart.push((char)(roundNum + 48) + "");
                    num -= roundNum;
                }
            }
            doing--;
        }
        Stack<String> reverseDecimalPart = new Stack<>();
        while (!decimalPart.isEmpty()){
            reverseDecimalPart.push(decimalPart.pop());
        }
        StringBuilder result = new StringBuilder();
        while (!integerPart.isEmpty()){
            result.append(integerPart.pop());
        }
        result.append(".");
        while (!reverseDecimalPart.isEmpty()){
            result.append(reverseDecimalPart.pop());
        }
        return result.toString();
    }

    public static double convertHexToDecimal (String string){
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
                if ((int)arr[i] >=65){
                    result += ((int)(arr[i]) - 55) * Math.pow(16,index);
                }else {
                    result += ((int)(arr[i]) - 48) * Math.pow(16,index);
                }
                index++;
            }

        }
        return result;
    }
}
