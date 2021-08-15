package midterm;

import java.util.Stack;

public class MidtermQ3 {
    public static void main(String[] args) {
        Stack<String> words1 = new Stack<String>();
        Stack<String> words2 = new Stack<String>();
        words1.push("abc");
        words1.push("def");
        words1.push("ghi");
        while (!words1.empty())
            words2.push(words1.pop());
        while (!words2.empty())
            System.out.print(words2.pop());
    }
}
