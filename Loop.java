import java.util.Scanner;
public class Loop {
public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter number");
int numInput = input.nextInt();


int t = 1;
while (t <= 30) {
System.out.println(t);
 t++;

 }

int countdown = 10;
while (countdown > 0) {
System.out.println("Happy new year");
  countdown--;
 
}

int i = 0;
do {
System.out.println(i);
 i++;
}

while (i < 5);




 }
}