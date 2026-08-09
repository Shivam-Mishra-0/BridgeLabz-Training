package Day1;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        d = d%n;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            temp[i] = arr[(i+d) %n];
        }
        for(int value: temp){
            System.out.print(value + " ");
        }
    }
}
