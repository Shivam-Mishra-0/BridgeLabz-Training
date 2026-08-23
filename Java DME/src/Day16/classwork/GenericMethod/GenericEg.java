package Day16.classwork.GenericMethod;

public class GenericEg {
    public static <T> void printArr(T[] array){
        for(T element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] intarr = {1,2,3,4,5,6};
        String[] strarr = {"Shivam", "Krishna", "Deepamshu"};
        Boolean[] boolarr = {true, false};

        printArr(intarr);
        System.out.println();
        printArr(strarr);
        System.out.println();
        printArr(boolarr);
    }
}
