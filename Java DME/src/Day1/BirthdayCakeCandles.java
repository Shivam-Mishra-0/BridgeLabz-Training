package Day1;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }

        int tallest = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > tallest){
                tallest = arr[i];
            }
        }
        int count = 0;


        for(int i = 0; i < n; i++){
            if(arr[i] == tallest){
                count++;
            }
        }
        System.out.println(count);
    }
}
