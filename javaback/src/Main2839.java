package javaback;
import java.util.*;

public class Main2839 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0; //설탕 봉지 개수
		/*
		 * 5로 나눠지는 경우 
		 * 5x+3y로 나눠지는 경우
		 * 3으로 나눠지는 경우 
		 */
		s.close();
		while(true) {
			if(num%3==0 && num%5==0) { // 3과 5의 나눴을 때 나머지 0 
				num -= 5;
			} 
			else if(num%5==0) { //5로만 나눠질 때
				num -= 5;
			}
			else if(num%3==0) { //3으로만 나눠질 때
				num -= 3;
			}
			else { //나머지
				num -= 5;
			}
			count++;
			
			if(num == 0) { //0일 때
				System.out.println(count);
				return;
			} 
			if(num <0) { //0이 더 클 때
				System.out.println(-1);
				return;
			}
		}
		
	}
}
