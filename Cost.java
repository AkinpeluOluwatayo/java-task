import java.util.Scanner;
	public class Cost {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter item: ");
	String item1 = input.nextLine();

	String item11 = "rice";

	System.out.print("Enter item: ");
	String item2 = input.nextLine();

	String item22 = "beans";


	System.out.print("Enter price: ");
	float price1 = input.nextFloat();

	double price11 = 6.11;

	System.out.print("Enter price: ");
	float price2 = input.nextFloat();

	double price22 = 7.11;

	double totalAmount = (6.11 + 7.11);

	System.out.println(totalAmount);
}
}

