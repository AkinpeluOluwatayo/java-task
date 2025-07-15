import java.util.Scanner;
	public class Conversion {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter degree in fahrenheit");
	double input1 = input.nextDouble();

	double fahrenheit = input1;
	double celsius = (5.0 / 9) * (fahrenheit - 32);

	System.out.println("Fahrenheit: " + fahrenheit + "is" + celsius + "in celsius");
 }
}
