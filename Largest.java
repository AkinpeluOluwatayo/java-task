import java.util.Scanner;
	public class Largest {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Score");
	int score = input.nextInt();

	int largest = score;
	int secondlargest = -2147483648;
	int count = 0;

	while(count <= 4){
	System.out.print("Enter Score");
	score = input.nextInt();

	if(score > largest)
	largest = score;

	if (score < largest && score > secondlargest)
	score = secondlargest;

	count ++;
	}
	
	System.out.println("Largest is" + largest);
	System.out.println("Secondlargest is " + secondlargest);




}
}