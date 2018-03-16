import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double num1 = 0 ;
		double num2 = 0 ;
		char operator;
		double answer = 0.0;
		
		Scanner scanObject = new Scanner(System.in);
		num1 = scanObject.nextDouble();
		num2 = scanObject.nextDouble();
		operator = scanObject.next().charAt(0);
		
		switch (operator) {
			
			case '+': answer = num1 + num2;
			break;
			case '-': answer = num1 - num2;
			break;
			case '/': answer = num1/num2;
			break;
			case '*': answer = num1 * num2;
			break;
	
		}
		
		System.out.println(num1+" "+operator+" "+num2+" = "+answer);
		
	}

}
