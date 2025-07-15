import java.util.Random;
import java.util.Scanner;
	public class Coin {
	public static void main(String [] args) {

	Random input = new Random();
	Scanner input1 = new Scanner(System.in);

	System.out.println("Enter integer");
	int num = input1.nextInt();

	int coinResults = input.nextInt(2);

	System.out.print("Coin flip: ");

	if (coinResults == num) {
	System.out.println("Your guess is correct");
	}
	else {
	System.out.println("Your guess is incorrect");
	}
	
}
}

