package javaStudy_backjoon;

import java.util.*;

public class Main2292 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int result = 1; //��� Ƚ���� ���� ����
		int roomNum = 1; //ó�� ���� �� ��ȣ 
		int plusNum = 6; //������
		// �� ���θ����� �ִ� ���� 1, 7, 19, 37, 61.....
		/*
		 * 1
		 * 7 = 1+6
		 * 19 = 7+6+6
		 * 37 = 19+6+6+6
		 * 61 = 37+6+6+6+6
		 */
		while(true) {
			if(num <= roomNum) {//num=13�� ��  
				break;
			}
			roomNum += plusNum; // 1)1+6=7       2)7+12=13        ....
			plusNum += plusNum; // 1)6+6=12(6+6) 2)12+6=18(6+6+6) ....
			result++; 
		}
		System.out.println(result);
	}
}


/*
���� �׸��� ���� ���������� �̷���� ������ �ִ�. 
�׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�.
 ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� ��
  �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
���� ���, 13������ 3��, 58������ 5���� ������.
*/