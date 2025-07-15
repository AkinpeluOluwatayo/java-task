import java.util.Scanner;

	public class Random {
	public static void main(String [] args) {

	Random input = new Random(6);
	Scanner input1 = new Scanner(System.in);

	System.out.print("Enter name");
	String name = input.nextLine();

	System.out.print("Hello " + name +" You rolled at dice "+ " 4");

}
}