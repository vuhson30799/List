package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            integerStack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(integerStack.pop() + " ");
        }
        System.out.println();
        scanner.nextLine();

        Stack<String> stringStack = new Stack<>();
        String s = scanner.nextLine();
        for (String x: s.split(" ")) {
            stringStack.push(x);
        }
        while (!stringStack.isEmpty()){
            System.out.print(stringStack.pop() + " ");
        }
    }
}
