package javaback;
import java.util.*;

public class Main2577 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int [] array = new int [10]; //0~9
		int result = A*B*C;
		while(result>0) {
			array[result%10]++;//나머지가 3이면 배열의 3번 자리 값이 1 증가  
			result /= 10; // result의 값은 10으로 나눈 값으로 저장 계속 나누다가 0이면 끝
		}
		for(int i=0; i<array.length; i++) //숫자의 개수 출력
			System.out.println(array[i]);
		
		s.close();
	}
}

/*
 <문제>
 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 
 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 
A × B × C = 150 × 266 × 427 = 17037300 이 되고, 

계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다. 
 */
