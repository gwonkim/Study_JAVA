package hw0_3;

import java.util.Scanner;

public class IntegerArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hw0_3 : ������");
		int [] number = new int[10]; // ���� ũ�Ⱑ 10�� �迭 
		double sum = 0; // ����
		double avg = 0; // ��հ�

		// ���� 10�� �Է� ����
		System.out.print("���� 10�� �Է� : ");
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
			sum += number[i];
		}

		// ���
		avg = sum / number.length;
		System.out.println("��� : " + avg);

		// ��պ��� ū ��
		System.out.print("��հ����� ū ���� : ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] > avg)
				System.out.print(number[i]+" ");
		}
	}
}