import java.util.Scanner;
	public class Note {
		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year");
		int year = input.nextInt();
		if (year % divisor == 4) { 
			Sytem.out.println("True Is a Leap Year");
		} 
		
		if (year % divisor == 400) {  
			System.out.println("True is a Leap Year");
		}
		else if (year % divisor != 4) { 
			System.out.println("False is not a Leap Year");
		}
		else if (year % divisor != 400) { 
			System.out.print("False is not a Leap Year");
		}
		}
	 