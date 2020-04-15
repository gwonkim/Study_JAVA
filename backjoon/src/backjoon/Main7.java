package backjoon;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int m = s.nextInt();
		
		int newH = h;
		int newM = m-45; //45을 빼기
		
		if(newM <0) { //45를 뺐을 때 M이 0보다 작으면 60분을 더하고 1시간을 빼기
			newM += 60; 
			newH--;
			if(newH < 0) //H가 0보다 작으면 24시간을 더한다.
				newH +=24; 
		}
		System.out.println(newH + " " + newM);
		s.close();
	}
}