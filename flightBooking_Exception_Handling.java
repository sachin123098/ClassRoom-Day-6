import java.util.Scanner;

public class flightBooking_Exception_Handling {
	String destination;
	String source;
	String name=null;
	String age;
	String city;

	public void customer() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name");
		name=scanner.nextLine();
		
		try {
			 if(name.isEmpty()) {
				 throw new Exception("invalid username");
			 }
			 }
		catch(Exception e){
			System.out.println("null pointer exception"+e.getMessage());
		}
		
		System.out.println("Enter city");
		city=scanner.nextLine();
		
		
		
		System.out.println("Enter age");
		age=scanner.nextLine();
		
		try {
			int ageof=Integer.parseUnsignedInt(age);
				System.out.println("age saved succesfully");
		}
		catch(Exception e){
			System.out.println("datatype exception"+e.getMessage());
		}
		
	}
	
	

	public void bookFlight() {
		int seatsAvailable_airIndia=5;
		int seatsAvailable_indigo=4;
		int seatsAvailable_kingFisher=3;
		int seatsAvailable_emirates=2;
	    Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter Source");
		source = scanner.nextLine();
		
		System.out.println("Enter Destination");
		destination = scanner.nextLine();
		
		if (source.equals("Hyderabad") && destination.equals ("Delhi") ) {
			System.out.println("Available Flights"+" "+"Air_India");
			System.out.println("press 1 to book and 2 to cancel");
			int input=scanner.nextInt();
			if (input==1 && seatsAvailable_airIndia <5) {
				customer();
				System.out.println("Booking Successful Booking Details");
				System.out.println("Name-->"+name+ " "+"Age-->"+ age+" "+"City-->"+city);
				System.out.println("from-->"+source+" "+"To-->"+destination);
				System.out.println("no of seats booked-->1");
			}
			else if(input==2) {
				System.out.println("Thank you");
			}
			else {
				System.out.println("Booking not Successful No seats available");
				
			}
		}
		else if(source.equals("Delhi") && destination.equals ("Chennai")) {
			System.out.println("Available Flights"+" "+"indigo");
			System.out.println("press 1 to book and 2 to cancel");
			int input=scanner.nextInt();
			if (input==1 &&seatsAvailable_indigo <5) {
				customer();
				System.out.println("Booking Successful Booking Details");
				System.out.println("Name-->"+name+ " "+"Age-->"+ age+" "+"City-->"+city);
				System.out.println("from-->"+source+" "+"To-->"+destination);
				System.out.println("no of seats booked-->1");
			}
			else if(input==2) {
				System.out.println("Thank you");
			}
			else {
				System.out.println("Booking not Successful No seats available");
				
			}
		}
		
		else if(source.equals("Punjab") && destination.equals ("Hyderabad")){
			System.out.println("Available Flights"+" "+"KingFisher"+" "+"Available seats-->"+(5-seatsAvailable_kingFisher));
			System.out.println("press 1 to book and 2 to cancel");
			int input=scanner.nextInt();
			if (input==1 && seatsAvailable_kingFisher<5) {
				customer();
				System.out.println("Booking Successful Booking Details");
				System.out.println("Name-->"+name+ " "+"Age-->"+ age+" "+"City-->"+city);
				System.out.println("from-->"+source+" "+"To-->"+destination);
				System.out.println("no of seats booked-->1");
			}
			
			else if(input==2) {
				System.out.println("Thank you");
			}
			else {
				System.out.println("Booking not Successful No seats available");
				
			}
		}
		else if(source.equals("Delhi") && destination.equals ("Goa")){
			System.out.println("Available Flights"+" "+"emirates");
			System.out.println("press 1 to book and 2 to cancel");
			int input=scanner.nextInt();
			if (input==1 && seatsAvailable_emirates <5) {
				customer();
				System.out.println("Booking Successful Booking Details");
				System.out.println("Name-->"+name+ " "+"Age-->"+ age+" "+"City-->"+city);
				System.out.println("from-->"+source+" "+"To-->"+destination);
				System.out.println("no of seats booked-->1");
			}
			else if(input==2) {
				System.out.println("Thank you");
			}
			else {
				System.out.println("Booking not Successful No seats available");
			}	
		}
		else {
			System.out.println("No Flights are Available for entered source and destination");
		}
	}
	
	
	public static void main(String[] args) {
		
		flightBooking_Exception_Handling b=new flightBooking_Exception_Handling();
		b.bookFlight();
	}

}
