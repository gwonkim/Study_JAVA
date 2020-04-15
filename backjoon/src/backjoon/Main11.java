package backjoon;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int count = 0;
		
		int arr[] = new int[T];
		int brr[] = new int[T];
		
		for(int i = 0; i < brr.length; i++) {
			arr[i] = s.nextInt();
			brr[i] = s.nextInt();
			}
		
		for(int i =0; i < brr.length; i++) {
			System.out.print("Case #" + (i+1) + ": ");
			System.out.println(arr[i] +" + "+ brr[i] + " = "  + (arr[i] + brr[i]));
		}
		s.close();
	}
}
