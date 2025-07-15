import java.util.Scanner;
	public class Multiple {
	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num = input.nextInt();

	if(num % 6 == 0) {
	System.out.print("multiple of 6");}

	else if(num % 7 == 0) {
	System.out.print("multiple of 7");}


	else{
	System.out.print("Is not a multiple");}


}
} 