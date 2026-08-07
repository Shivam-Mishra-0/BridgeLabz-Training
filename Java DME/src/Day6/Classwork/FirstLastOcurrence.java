package Day6.Classwork;

public class FirstLastOcurrence {
    public static int findFirstQcurrence(int[] arr,int target){
        int low = 0;
        int high = arr.length;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if( arr[mid] == target){
                result = mid;
                high = mid -1;
            }
            else if( arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static int findLastOcurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if( arr[mid] == target){
                result = mid;
                low = mid + 1;
            }
            else if( arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,4,4,4,5,6};
        System.out.println(findFirstQcurrence(arr, 4));
        System.out.println(findLastOcurrence(arr, 4));
    }
}
