package javaback;

import java.util.Scanner;

public class Main11654 {  //아스키코드 변환
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.next().charAt(0);//nextint -> X //글자로 받고 정수로 변환할 것
		System.out.println(num);
		s.close();
	}
}
