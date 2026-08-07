package Day6.Classwork;

public class BinarySearchIterative {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;

        while( low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};

        System.out.println(binarySearch(arr, 4));;
    }
}
