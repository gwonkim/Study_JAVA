package hw0_3;

import java.util.Scanner;

public class IntegerArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hw0_3 : 김지원");
		int [] number = new int[10]; // 정수 크기가 10인 배열 
		double sum = 0; // 총합
		double avg = 0; // 평균값

		// 정수 10개 입력 저장
		System.out.print("정수 10개 입력 : ");
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
			sum += number[i];
		}

		// 평균
		avg = sum / number.length;
		System.out.println("평균 : " + avg);

		// 평균보다 큰 값
		System.out.print("평균값보다 큰 정수 : ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] > avg)
				System.out.print(number[i]+" ");
		}
	}
}