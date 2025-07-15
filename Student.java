import java.util.Scanner;
	public class Student {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter name: ");
	String studentName = input.next();

	System.out.print("Enter number: ");
	int studentNumber = input.nextInt();

	System.out.print("Enter fees: ");
	float studentFees = input.nextFloat();

	System.out.print("Student age: ");
	int studentAge = input.nextInt();
A
	System.out.print("Enter grade: ");
	String studentGrade = input.nextLine();

	System.out.println("studentName");
	System.out.println("studentNumber");
	System.out.println("studentFees");
	System.out.println("studentAge");
	System.out.println("studentGrade");
	
	}
}
