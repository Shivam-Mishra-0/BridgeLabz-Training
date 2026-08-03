package Day2;

import java.util.*;


class MaximumElement {


    public static List<Integer> getMax(List<String> operations) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for( String operation: operations){
            String[] part = operation.split(" ");
            int type = Integer.parseInt(part[0]);

            if( type == 1 ){
                int value = Integer.parseInt(part[1]);
                stack.push(value);

                if( maxStack.isEmpty() || value >= maxStack.peek()){
                    maxStack.push(value);
                }
                else
                {
                    maxStack.push(maxStack.peek());
                }
            }
            else if ( type == 2){
                stack.pop();
                maxStack.pop();
            }
            else if(type == 3){
                result.add(maxStack.peek());
            }
        }
        return result;
    }

}

