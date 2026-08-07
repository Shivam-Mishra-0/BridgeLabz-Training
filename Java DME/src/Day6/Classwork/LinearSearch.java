package Day6.Classwork;

public class LinearSearch {
    public static int linearSearch(int[] arr, int n){

        for( int i = 0; i < arr.length; i++){
            if( arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,4,53,42,2,6,3};

        int n = 53;
        System.out.println(linearSearch(arr, n));
    }
}