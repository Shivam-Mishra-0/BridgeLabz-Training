package Day2;


import java.util.*;

class BalancedBrackets {


    public static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for( char c : s.toCharArray()){

            if( c == '(' ||  c == '[' ||  c == '{'  ){
                stack.push(c);
            }
            else if( c == ')' ||  c == '}' ||  c == ']'){

                if ( stack.isEmpty()){
                    return "NO";
                }

                char top = stack.peek();

                if( (c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '[')  ){
                    stack.pop();
                }
                else{
                    return "NO";
                }

            }
        }

        if (stack.isEmpty()){
            return "YES";
        }
        else
        {
            return "NO";
        }
        // return "Yes";

    }

}

