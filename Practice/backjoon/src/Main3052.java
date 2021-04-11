package javaback;

import java.util.Scanner;

public class Main3052 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] array = new int[10]; //10개 정수 입력
		int [] count = new int[42];
		int cou =0;
		
		for(int i=0; i<array.length; i++) {
			int num = s.nextInt();
			count[array[i] = num%42]++; 
			//array[i]에 나머지 저장
			//count[나머지]++ 나머지가 같으면 값증가 
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] != 0) {
				cou++;
			}
		}
		System.out.println(cou); //서로 다른 값 수 출력
	}
}
