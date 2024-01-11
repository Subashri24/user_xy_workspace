package Demo;
import java.util.Scanner;
public class Assignment_QNO5 {

	public static void main(String[] args) {
		 int x, y, result;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Input two integers");
		 System.out.println("Enter the first number: ");
		 x = scan.nextInt();
		 System.out.println("Enter the second number: ");
		 y = scan.nextInt();
		 scan.close();
		 // try block
		 try {
		 result = x/ y;
		 System.out.println("Result = " + result);
		 }
		 // catch block
		 catch (ArithmeticException e) {
		 System.out.println("Exception caught: Division by zero.");
		 }
		 }
		}

