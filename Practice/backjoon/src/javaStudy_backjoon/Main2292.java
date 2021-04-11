package javaStudy_backjoon;

import java.util.*;

public class Main2292 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int result = 1; //계속 횟수를 더할 변수
		int roomNum = 1; //처음 시작 방 번호 
		int plusNum = 6; //육각형
		// 각 라인마다의 최대 숫자 1, 7, 19, 37, 61.....
		/*
		 * 1
		 * 7 = 1+6
		 * 19 = 7+6+6
		 * 37 = 19+6+6+6
		 * 61 = 37+6+6+6+6
		 */
		while(true) {
			if(num <= roomNum) {//num=13일 때  
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
위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때
  몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
*/