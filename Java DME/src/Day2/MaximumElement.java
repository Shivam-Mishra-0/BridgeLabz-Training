package Day2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


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

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
