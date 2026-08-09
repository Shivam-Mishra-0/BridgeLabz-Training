package  Day2;

import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine().trim());

        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        StringBuilder output = new StringBuilder();

        for( int i =0; i < q; i++){
            String[] parts = sc.nextLine().split(" ");
            int type = Integer.parseInt(parts[0]);

            if( type == 1){
                String s = parts[1];
                sb.append(s);
                stack.push("A" + s);
            }
            else if( type == 2){
                int k = Integer.parseInt(parts[1]);
                String removed = sb.substring(sb.length() - k);
                sb.setLength(sb.length() - k);
                stack.push("D" + removed);
            }
            else if( type == 3){
                int k = Integer.parseInt(parts[1]);
                output.append(sb.charAt(k - 1)).append("\n");
            }
            else if (type == 4){
                String last = stack.pop();
                char c = last.charAt(0);
                String data = last.substring(1);

                if ( c == 'A'){
                    sb.setLength(sb.length() - data.length());
                }
                else{
                    sb.append(data);
                }
            }
        }

        System.out.println(output);
    }
}