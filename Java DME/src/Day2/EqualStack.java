package Day2;

import java.util.*;
class EqualStack {


    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

        int i1 = 0, i2 = 0, i3 =0;
        long sum1 =0, sum2 = 0, sum3 = 0;
        for( int value: h1){
            sum1 += value;
        }
        for( int value: h2){
            sum2 += value;
        }
        for( int value: h3){
            sum3 += value;
        }

        while( ! (sum1 == sum2 && sum2 == sum3)){
            if( sum1 >= sum2 && sum1 >= sum3){
                sum1 -= h1.get(i1);
                i1++;
            }
            else if ( sum2 >= sum1 && sum2 >= sum3){
                sum2 -= h2.get(i2);
                i2++;
            }
            else{
                sum3 -= h3.get(i3);
                i3++;
            }
        }

        return (int) sum1;


    }

}
