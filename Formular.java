import java.util.Scanner;
	public class Formular {
	public static void main(String[] args ) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter value for a");
	double a = input.nextDouble();

	System.out.print("Enter value for b");
	double b = input.nextDouble();

	System.out.print("Enter value for c");
	double c = input.nextDouble();

	double determinant = (b * b) - 4 * a * c;
if(determinant >= 0) {

	double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
	double x2 = (-b - Math.sqrt(determinant)) / (2 * a);

	System.out.printf("The first root is %f ", x1);
	System.out.printf("The second root is %f ", x2);
}

	else {
	System.out.print("There is no root for this");
}

}
}