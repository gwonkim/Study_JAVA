package backjoon;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		for(int i=num; i>0; --i){
			System.out.println(i);
		}
		s.close();
	}

}