package javaStudy_backjoon;
import java.util.*;

public class Main1193 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int numOfLine = 1;
		int sum = 1;
		// x/y

		while(sum < num) { //n의 라인 찾기
			numOfLine++;
			sum += numOfLine;
		}
		int temp = numOfLine; //라인
		int n=1;
		for(int i=(sum-numOfLine)+1; i<num; i++) {
			numOfLine--;
			n++;
		}
		System.out.println(temp%2==0 ? n+"/"+numOfLine : numOfLine+"/"+n );
		//짝수이면 분모 1234,분자 라인 
		s.close();

	}
}
/* 문제 파악 
 * 1/1 
 * 1/2 2/1
 * 3/1 2/2 1/3
 * 1/4 2/3 3/2 4/1
 * ....
 * 홀수 분자 라인의 숫자부터 시작 3번째 라인 = 3, 2, 1
 * 홀수 분모 1,2,3,4,...
 * 
 * 짝수 분모 1,2,3,4,...
 * 짝수 분모 라인의 숫자부터 시작해서 4번째 라인 = 4,3,2,1
 * 
 * 14번 쩨  2/4
 * 
 * 
 */
