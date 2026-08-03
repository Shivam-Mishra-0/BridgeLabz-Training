package Day2;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String exp){
        Stack<Character> stack = new Stack<>();

        for( char c: exp.toCharArray()){
            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']'){
                if( stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();

                if( (c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[') ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "{[(])}";

        System.out.println( exp1 + ": " + (isBalanced(exp1)? "Balanced" : "UnBalanced" ));
    }
}
