/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
 Show menu with switch
 Allow multiple bookings using while-loop.
 Stop booking once seats reach zero (break).*/


import java.util.Scanner;
public class TrainReservation{
    
    public static String[] coaches = {"AC1", "AC2", "AC3","SLEEPER"};
    public static int[] seats = {5,5,5,5};	

    public static boolean isBook(Scanner sc){
	System.out.print("Choose (1: AC   2 : AC2 3 :AC3  4 : SLEEPER)");
	int input = sc.nextInt();
		switch( input ){
		case 1 -> {
		    if  ( seats[input-1] > 0 ){
			seats[input-1]--;
			System.out.println("Your seat in " + coaches[input-1] + " is Booked ");
			}
			else{
			System.out.println("NO SEATS AVAILABLE");
			return true;
		} }
		case 2 -> {
		    if  ( seats[input-1] > 0 ){
			seats[input-1]--;
			System.out.println("Your seat in " + coaches[input-1] + " is Booked :");
			}
			else{
			System.out.println("NO SEATS AVAILABLE");
			return true;
		} }
		case 3 ->{
		    if  ( seats[input-1] > 0 ){
			seats[input-1]--;
			System.out.println("Your seat in " + coaches[input-1] + " is Booked :");
			}
			else{
			System.out.println("NO SEATS AVAILABLE");
			return true;
		} }
		case 4 -> {
		    if  ( seats[input-1] > 0 ){
			seats[input-1]--;
			System.out.println("Your seat in " + coaches[input-1] + " is Booked :");
			}
			else{
			System.out.println("NO SEATS AVAILABLE");
			return true;
		} }
	    }
	return false;
    }

    public static void show(){
	System.out.printf("%-10s", "Type");
	System.out.printf("%-10s" ,"S. No.","Seat Avail");
	System.out.printf("\n-------------------------\n");
	for( int i=0;i<coaches.length;i++){
	    System.out.printf("%-5d%-10s %-10d\n", (i+1) ,coaches[i], seats[i] );   
  	}
    }
   


    //public static int AcOne = 20,	
    
    public static void main(String[] args){
	System.out.println("===Welcome to Ticket Reservation===\n");
	Scanner sc  = new Scanner (System.in);
	String input = "";
	while( true ){
	    System.out.println(" Choose: book, show and exit\n");
   	    input = sc.next();
	    boolean flag = false;   //seats full
	    System.out.println(" Choose: book, show and Exit\n");
	    switch( input ){
		case "book" -> flag = isBook(sc);
		case "show" -> show();
		case "exit" -> {
		    System.out.println("Thank You, visit again!!");
		    flag = true;
		}
	    }
		if ( flag ) 
		    break;
	}	

   sc.close();
   }
}