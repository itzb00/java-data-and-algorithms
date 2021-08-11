package stackexamples;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Balance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response = "";
        while (!response.equals("quit")) {
            System.out.println("Please enter a sentence: ");
            String line = keyboard.nextLine();
            boolean b = isBalanced(line);
            if (b) {
                System.out.println("The string is balanced");
            } else {
                System.out.println("The string is unbalanced");
            }
            System.out.println("Type enter to continue or quit to exit: ");
            response = keyboard.nextLine();
        }
    }

    public static boolean isBalanced(String line) {
        boolean isBalanced = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            if( line.charAt(i) == '(') {
                stack.push('(');
            }
            if( line.charAt(i) == ')') {
                try {
                    stack.pop();
                } catch(EmptyStackException e) {
                    return false;
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
