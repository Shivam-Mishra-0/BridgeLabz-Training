package Day16.HackerRank;

import java.io.*;
import java.util.*;

public class JavaStatic {
    static int breadth, height;
    static{
        Scanner sc = new Scanner(System.in);
        breadth = sc.nextInt();
        height = sc.nextInt();

        if( breadth > 0 && height > 0){
            int area = breadth * height;
            System.out.println(area);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {

    }
}
