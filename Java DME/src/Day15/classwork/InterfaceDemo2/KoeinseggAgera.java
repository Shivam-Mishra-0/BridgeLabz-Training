package Day15.classwork.InterfaceDemo2;

public class KoeinseggAgera extends SportsCar implements SuperCar  {

    @Override
    public void superfast(){
        System.out.println("This is a super car with 4 seater.");
    }

    @Override
    public void sportsFast(){
        System.out.println("This car can go upto 300km/h");
    }

    public static void main(String[] args) {
        SportsCar sports = new KoeinseggAgera();
        sports.sportsFast();

        SuperCar superCar = new KoeinseggAgera();
        superCar.superfast();


    }
}
