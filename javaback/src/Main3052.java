package javaback;

import java.util.Scanner;

public class Main3052 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] array = new int[10]; //10�� ���� �Է�
		int [] count = new int[42];
		int cou =0;
		
		for(int i=0; i<array.length; i++) {
			int num = s.nextInt();
			count[array[i] = num%42]++; 
			//array[i]�� ������ ����
			//count[������]++ �������� ������ ������ 
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] != 0) {
				cou++;
			}
		}
		System.out.println(cou); //���� �ٸ� �� �� ���
	}
}
