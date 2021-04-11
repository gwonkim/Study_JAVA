package javaback;

import java.util.Scanner;

public class Main11720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum=0;
		String n = s.next();
		
		for(int i=0; i<num; i++) {
			sum += n.charAt(i)-'0';	//'0' = 48을 의미 		
		}
		System.out.println(sum);
		s.close();
	}
}
