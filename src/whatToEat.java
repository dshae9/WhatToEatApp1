import java.util.Scanner;
public class whatToEat {
 public static void main(String[] args) {
	 
	 Scanner scnr = new Scanner(System.in);
	var eventType = scnr.nextLine();
	var partySize = scnr.nextLine();
	
	
	if(eventType = "casual") {
		var foodType = "sandwiches made in the microwave.";
	}if(eventType = "semi-formal") {
		var foodType = "fried chicken in your kitchen.";
	}if(eventType = "formal") {
		var foodType = "chicken parmasean by a caterer.";
	}
	if(partySize <= 1) {
		System.out.println("a small group");
	}if(partySize <= 12) {
		System.out.println("a medium sized group");
	}if(partySize <= 13) {
		System.out.println("a large group");
	}
	
	
	
	
	
	
	System.out.println("Since you're hosting a " + eventType +
			" for " + partySize + "you should serve" + foodType);
			
			
			
}}
