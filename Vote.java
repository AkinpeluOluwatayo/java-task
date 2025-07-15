import java.util.Scanner;
	public class Vote {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter age");
	int age = input.nextInt();

	boolean eligible = age >= 18;

	if (age >= 18)
	System.out.print("Eligible to vote");

	else 
	System.out.println("Not eligible to vote"); 
}
}