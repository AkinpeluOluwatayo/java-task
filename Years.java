import java.util.Scanner;
	public class Years {
		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
	
	System.out.print("Enter year");
	int year = input.nextInt();
	if(year >= 1000){
	}
	if(year % 4 == 0 && year % 100 != 0 ); {
	System.out.println("True a leap year");
	}
	if(year % 100 != 0 && year % 400 != 0); {
	
	System.out.println("Invalid year"); 
	}
	
}
}
