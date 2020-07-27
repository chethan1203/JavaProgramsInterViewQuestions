package JavaBestExamples85;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		double a  =scn.nextDouble();
		double b = scn.nextDouble();
		
		System.out.println("Math selection(+, -, *, /)");
		char math = scn.next().charAt(0);
		double result = 0;
		switch (math) {
		case '+':
			result = a + b; 
			break;
		case '-':
			result = a - b; 
			break;
		case '*':
			result = a * b; 
			break;
		case '/':
		result = a / b; 
			break;
		default:
			System.out.println("Please pass proper operator");
			break;
		}
		System.out.println(result);
	}

}
