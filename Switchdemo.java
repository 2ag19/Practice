import java.util.Scanner;

public class Switchdemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		System.out.println("Enter your option");
		System.out.println("+ ---> Addition");
		System.out.println("- ---> Subtraction");
		System.out.println("* ---> Multiplication");
		System.out.println("/ ---> Division");
		System.out.println("% ---> Modulo division");
		char choice = scan.next().charAt(0);
		Switchdemo1 switchdemo1 = new Switchdemo1();
		switchdemo1.arithematicoperation(choice, num1, num2);
		scan.close();
		}
}

		