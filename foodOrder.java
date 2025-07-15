import java.util.Scanner;
	public class foodOrder {
	public static void main(String [] args) {

	Scanner inputCollector = new Scanner(System.in);

	System.out.print("""
            
            Welcome to Ayomide resturant
     
	Select Order
1. Order
2. Sell

					""");
int userInput = inputCollector.nextInt();

switch(userInput) {
case 1: System.out.println("""

	customers drink order 
     Select Order
1. Coke
2. Fanta
3. Pepsi
4. Exit
			""");
int drinkOrder = inputCollector.nextInt();

	switch (drinkOrder) {
	case 1:
	System.out.print("""

 customers food order 
   select Order
1. Pizza
2. Chicken
3. Pasta
4. Exit
			""");
int foodOrder = inputCollector.nextInt();
switch (foodOrder) {
case 1: System.out.print("You have ordered Coke and Pizza successfully");
break;
case 2: System.out.print("You have ordered Coke and Chicken successfully");
break;
case 3: System.out.print("You have ordered Coke and Pasta successfully");
break;
} 
break;
 case 2:
System.out.print("""

 customers food order 
   select Order
1. Pizza
2. Chicken
3. Pasta
4. Exit
			""");
int foodOrder1 = inputCollector.nextInt();
switch (foodOrder1) {
case 1: System.out.print("You have ordered fanta and Pizza successfully");
break;
case 2: System.out.print("You have ordered fanta and Chicken successfully");
break;
case 3: System.out.print("You have ordered fanta and Pasta successfully");
break;
}	

case 3:
System.out.print("""

 customers food order 
   select Order
1. Pizza
2. Chicken
3. Pasta
4. Exit
			""");
int foodOrder2 = inputCollector.nextInt();
switch (foodOrder2) {
case 1: System.out.print("You have ordered pepsi and Pizza successfully");
break;
case 2: System.out.print("You have ordered pepsi and Chicken successfully");
break;
case 3: System.out.print("You have ordered pepsi and Pasta successfully");
break;
}	



 }








}





 }
}
