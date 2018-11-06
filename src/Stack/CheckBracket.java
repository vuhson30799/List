package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        boolean checkAvailableExpression = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                characterStack.push('(');
            }
            if (arr[i] == ')'){
                if (characterStack.isEmpty()){
                    characterStack.push(')');
                    break;
                }else {
                    characterStack.pop();
                }
            }
        }
        if (characterStack.isEmpty()){
            checkAvailableExpression = true;
        }
        if (checkAvailableExpression) {
            System.out.println("this is legal expression");
        }else{
            System.out.println("This is illegal expression");
        }
    }
}
