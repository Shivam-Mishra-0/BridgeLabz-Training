package Day16.classwork.GenericBounded;

public class GenericBounded {
    public static <T extends Number> void average(T[] arr){
        double sum = 0.0;
        for( T element: arr){
            sum += element.doubleValue();
        }
        double avg = sum / arr.length;

        System.out.println(avg);
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};
        Float[] farr = {1.0F,3.34F};
        Double[] darr = {2.34,3.43};

        average(arr);
        average(farr);
        average(darr);
    }
}
