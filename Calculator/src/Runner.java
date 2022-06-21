import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		//Created a scanner object and a calculator object
		Scanner input = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Please enter the first number:");
		double a = input.nextDouble();
		
		System.out.println("Please enter the second number:");
		double b = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("What operator would you like to use?");
		String operator = input.nextLine();
		
		switch(operator) {
		case "+":
			System.out.println("The solution to your question is: " + calc.add(a, b));
			break;
		case "-":
			System.out.println("The solution to your question is " + calc.subtraction(a,b)) ;
			break;
		case "*":
			System.out.println("The solution to your question is " + calc.mulitplication(a,b)) ;
			break;
		case "/":
			if(b == 0) {
				System.out.println("Please enter a number that is not 0 as the second number");
			}else {
			System.out.println("The solution to your question is " + calc.divide(a,b)) ;
			break;
			}
		}
	}

}
