package Day16.classwork.GenericPra1;

import jdk.jfr.DataAmount;

public class Main {
    public static void main(String[] args) {
        DataProcessor<String> student = new Student<>();
        DataProcessor<Integer> employee = new Employee<>();

        System.out.println("Student Data: ");
        student.add("Shivam");
        student.process();
        student.add("Krishna");
        student.process();
        student.add("Deepanshu");
        student.process();
        student.add("Pratham");
        student.process();


        System.out.println("Employee Data: ");
        employee.add(485);
        employee.process();
        employee.add(424);
        employee.process();
        employee.add(458);
        employee.process();


    }
}
