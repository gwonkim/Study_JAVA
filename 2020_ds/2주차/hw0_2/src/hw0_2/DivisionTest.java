package hw0_2;

import java.util.Scanner;

public class DivisionTest {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hw0_2 : ������");
		
		System.out.print("x �Է� : ");
		double num1 = scan.nextDouble();
		System.out.print("y �Է� : ");
		double num2 = scan.nextDouble();
		
		double division = num1/num2;
		System.out.println(num1 + "/" + num2 + " = " + division);
	}
}
