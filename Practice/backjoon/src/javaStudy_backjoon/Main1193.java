package javaStudy_backjoon;
import java.util.*;

public class Main1193 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int numOfLine = 1;
		int sum = 1;
		// x/y

		while(sum < num) { //n�� ���� ã��
			numOfLine++;
			sum += numOfLine;
		}
		int temp = numOfLine; //����
		int n=1;
		for(int i=(sum-numOfLine)+1; i<num; i++) {
			numOfLine--;
			n++;
		}
		System.out.println(temp%2==0 ? n+"/"+numOfLine : numOfLine+"/"+n );
		//¦���̸� �и� 1234,���� ���� 
		s.close();

	}
}
/* ���� �ľ� 
 * 1/1 
 * 1/2 2/1
 * 3/1 2/2 1/3
 * 1/4 2/3 3/2 4/1
 * ....
 * Ȧ�� ���� ������ ���ں��� ���� 3��° ���� = 3, 2, 1
 * Ȧ�� �и� 1,2,3,4,...
 * 
 * ¦�� �и� 1,2,3,4,...
 * ¦�� �и� ������ ���ں��� �����ؼ� 4��° ���� = 4,3,2,1
 * 
 * 14�� ��  2/4
 * 
 * 
 */
