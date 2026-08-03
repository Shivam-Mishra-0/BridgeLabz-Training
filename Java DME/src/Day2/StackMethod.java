package Day2;

import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push method
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        // Peek Method
        System.out.println("Peek : " + stack.peek());

        // Pop Method
        int removed = stack.pop();
        System.out.println("Removed Element: " + removed);
        System.out.println(stack);
    }
}
