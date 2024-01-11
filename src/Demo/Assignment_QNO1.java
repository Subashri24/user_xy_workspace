//To find the given number is prime or not
package Demo;

import java.util.Scanner;

public class Assignment_QNO1 {
	public boolean isPrimeNumber(int x) {
		for (int y=2;y<=x/2;y++){
			if(x%y==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	int z;
	Assignment_QNO1 fg=new Assignment_QNO1();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to find Prime or not:");
	z = scan.nextInt();
	scan.close();
	if(fg.isPrimeNumber(z))
		System.out.println(z+" is a Prime number");
	else
		System.out.println(z+" is not a Prime number");
	}
}
