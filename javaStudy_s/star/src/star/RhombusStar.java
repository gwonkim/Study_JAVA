package star;

import java.util.Scanner;

public class RhombusStar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.(1 또는 짝수 입력 불가)");
		int number = s.nextInt(); // number == 마름모 반 사이즈(높이/2) == 삼각형의 높이

		while (number <= 1 || number % 2 == 0) {
			if (number <= 1) {
				System.out.println("1보다 작은 숫자는 입력이 불가합니다.");
				number = s.nextInt();
			} else if (number % 2 == 0) {
				System.out.println("짝수는 입력이 불가합니다.");
				number = s.nextInt();
			}
		}
		rhombus(number);
	}

	public static void rhombus(int number) {
		// number만큼의 삼각형 생성(number만큼의 줄이 생성)
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number - i; j++)
				System.out.print(" ");
			for (int j = 1; j < 2 * i; j++)
				System.out.print("*");
			System.out.println();
		}

		// number-1 만큼의 역삼각형 생성
		// 내림차순으로 돌린 것을 제외하면 위 for문과 같음
		for (int i = number - 1; i > 0; i--) {
			for (int j = 0; j < number - i; j++)
				System.out.print(" ");
			for (int j = 1; j < 2 * i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("*입력한 숫자 : " + number);
		System.out.println("*입력한 숫자는 마름모 높이의 1/2");
	}

}
