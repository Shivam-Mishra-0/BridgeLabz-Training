package Day6.Classwork;

public class BinarySearchRecursive {
    public static int binarySearchR(int[] arr, int low, int high, int target){
        if( low > high){
            return-1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if( arr[mid] < target){
            return binarySearchR(arr, mid +1, high, target);
        }
        else{
            return binarySearchR(arr, low, mid -1, target);
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8};

        int low = 0;
        int high = arr.length-1;
        int target = 4;

        System.out.println(binarySearchR(arr, low, high, target));
    }
}
