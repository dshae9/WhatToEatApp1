import java.util.Scanner;

public class whatToEat {
public static void main(String[] args) {
	 
	Scanner scnr = new Scanner(System.in);
    System.out.println("Enter event type: ");
	String eventType = scnr.nextLine();
    System.out.println("Enter party size: ");
    int partySize;
    partySize = scnr.nextInt();
	
    System.out.println("If your " + eventType + " event is for " + partySize );
	
	if(partySize <= 4) {
		System.out.println(" , a small group will eat sandwiches from Jimmy Johns.");
	}else if(partySize <= 10) {
		System.out.println(" , a medium sized group will eat fried chicken from your kitchen.");
	}else if(partySize >= 13) {
		System.out.println(" , a large group will eat chicken parmasean from a caterer.");
	}

 }}