package javaback;
import java.util.Scanner;

public class Main2 { //���� 2562����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []number = new int[9];
		
		for(int i=0; i<number.length; i++) { //�迭 �� �Է�
			number[i] = s.nextInt();
		}
		s.close();
		
		int max = 0; 
		int index = 0; //��ġ ����

		for(int i=0; i<number.length; i++) {
			if(number[i] >= max) {
				max=number[i];
				index = i+1; //�ִ밪 ���� ��ġ ����
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
