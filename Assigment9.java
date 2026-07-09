package demo.Assigments;


	import java.util.Scanner;

	public class Assigment2 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter numerator: ");
	            int numerator = sc.nextInt();

	            System.out.print("Enter denominator: ");
	            int denominator = sc.nextInt();

	            int result = numerator / denominator;

	            System.out.println("Result = " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero is not possible.");
	        } catch (Exception e) {
	            System.out.println("Invalid input.");
	        }

	        sc.close();
	    }
	}


