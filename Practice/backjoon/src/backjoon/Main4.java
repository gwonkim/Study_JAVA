package backjoon;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 ==0))
			System.out.println("1");
		else
			System.out.println("0");
		s.close();
	}
}
