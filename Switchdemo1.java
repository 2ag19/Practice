public class Switchdemo1 {
	public void arithematicoperation(char choice, int num1, int num2) {
		switch(choice){
		case'+':
			System.out.println("Addition of num = " + (num1 + num2));
			break;
		case'-':
			System.out.println("Subtraction of num = " + (num1 - num2));
			break;
		case'*':
			System.out.println("Multiplication of num = " + (num1 * num2));
			break;
		case'/':
			System.out.println("Division of num = " + (num1 / num2));
			break;
		case'%':
			System.out.println("Addition of num = " + (num1 % num2));
			break;
			default:
			{System.out.println("Invalid choice");
				
			}
	
	
		
		
			
		}
		
	}

}
