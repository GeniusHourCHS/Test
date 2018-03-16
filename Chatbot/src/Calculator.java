import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double num1 = 0 ;
		double num2 = 0 ;
		char operator;
		double answer = 0.0;
		
		Scanner scanObject = new Scanner(System.in);
		System.out.println("What is your 1st number");
		num1 = scanObject.nextDouble();
		System.out.println("Waht is your 2nd numbner");
		num2 = scanObject.nextDouble();
		System.out.println("What is your opperation's symbol");
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
