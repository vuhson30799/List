package Queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Stack<String> stringStack = new Stack<>();
        String[] words = string.split(" ");
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while (i != words.length){
            temp.append(words[i]);
            temp.reverse();
            stringStack.push(temp.toString());
            temp.delete(0,words[i].length());
            i++;
        }
        boolean check = true;
        for (String x :
                words) {
            if (!x.equals(stringStack.pop())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This isn't palindrome");
        }
    }

}
