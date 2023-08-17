
public class Calculator {

	public void arithematicoperation(char choice, int num1, int num2) {
		if(choice == '+') {
			System.out.println("Addition of num = " + (num1 + num2));
		}else if(choice == '-') {
			System.out.println("Subtraction of num = " + (num1 - num2));
		}else if(choice == '*') {
			System.out.println("Multiplication of num = " + (num1 * num2));
		}else if(choice == '/') {
			System.out.println("Division of num = " + (num1 / num2));
		}else if(choice == '%') {
			System.out.println("Modulo division of num = " + (num1 % num2));
		}else {
			System.out.println("Invalid choice");
		}
		
	}

}
