
import java.util.Scanner;
class Calculator{
	void calc(double n1,double n2,char op) {
		double result;
		switch(op) {
		case '+':
			result=n1 + n2;
			System.out.println("Result "+result);
			break;
			
		case '-':
			result=n1 - n2;
			System.out.println("Result "+result);
			break;
			
		case '*':
			result=n1 * n2;
			System.out.println("Result "+result);
			break;
		case '/':
			if(n2!=0) {
				result=n1 / n2;
				System.out.println("Result "+result);
			}else {
				System.out.println("Divisible by zero is not allowd");
			}
			break;
			
		default:
			System.out.println("Invalid operator");
		}
		
	}
	
	
	
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number:");
		double n1=sc.nextInt();
		System.out.println("Enter a second number:");
		double n2=sc.nextInt();
		System.out.println("Enter the operator (+, -, *, /): ");
		char op=sc.next().charAt(0);
		c.calc(n1, n2, op);
		
		

	}

}










