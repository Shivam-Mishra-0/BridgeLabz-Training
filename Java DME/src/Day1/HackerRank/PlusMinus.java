package Day1;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }

        double ptve = 0;
        double ntve = 0;
        double zro = 0;

        for ( double value: arr ){
            if ( value < 0 ){
                ntve++;
            }
            else if ( value > 0 ){
                ptve++;
            }
            else{
                zro++;
            }
        }

        double positive = ptve / n;
        double negative = ntve / n;
        double zero = zro/n;

        String positiveF = String.format("%.6f", positive);
        String negativeF = String.format("%.6f", negative);
        String zeroF = String.format("%.6f", zero);

        System.out.println(positiveF);
        System.out.println(negativeF);
        System.out.println(zeroF);
    }
}
