package backjoon;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int m = s.nextInt();
		
		int newH = h;
		int newM = m-45; //45�� ����
		
		if(newM <0) { //45�� ���� �� M�� 0���� ������ 60���� ���ϰ� 1�ð��� ����
			newM += 60; 
			newH--;
			if(newH < 0) //H�� 0���� ������ 24�ð��� ���Ѵ�.
				newH +=24; 
		}
		System.out.println(newH + " " + newM);
		s.close();
	}
}