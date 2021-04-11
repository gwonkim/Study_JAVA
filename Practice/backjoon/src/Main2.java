package javaback;
import java.util.Scanner;

public class Main2 { //백준 2562문제
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []number = new int[9];
		
		for(int i=0; i<number.length; i++) { //배열 수 입력
			number[i] = s.nextInt();
		}
		s.close();
		
		int max = 0; 
		int index = 0; //위치 변수

		for(int i=0; i<number.length; i++) {
			if(number[i] >= max) {
				max=number[i];
				index = i+1; //최대값 변수 위치 저장
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
