import java.util.Scanner;
	public class Flip {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first  number: ");
	int num1 = input.nextInt();

	System.out.print("Enter second number");
	int num2 = input.nextInt();

	System.out.print("Enter third number");
	int num3 = input.nextInt();

	System.out.print("Enter fourth number");
	int num4 = input.nextInt();

	System.out.print("Enter fifth number");
	int num5 = input.nextInt();
	
       	int largest = num1; 
	int smallest = num1;

       if (num2 > largest) largest = num2;
	
       if (num3 > largest) largest = num3;

       if (num4 > largest) largest = num4;
	
       if (num5 > largest) largest = num5;

	System.out.println("Largest is: " + largest);


       if (num1 > largest) smallest = num2;
	
       if (num3 > largest) smallest = num3;

       if (num4 > largest) smallest = num4;
	
       if (num5 > largest) smallest = num5;


	System.out.println("Smallest is: " + smallest);





}
}	

