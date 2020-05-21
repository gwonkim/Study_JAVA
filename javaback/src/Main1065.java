package javaback;

import java.util.Scanner;

public class Main1065 {
		public static void main(String[] args ) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			number(num);
			s.close();

		}
		static void number(int num) {
				int count=0;
				for(int i=1; i<=num; i++) {
					if(i < 100) {
						count++;
					}
					else if(i<1000) {
						int one = i%10;
						int two = (i/10)%10;
						int three = (i/100)%10;
						
						if(one-two == two-three) {
							count++;
						}
					}
				}
				System.out.println(count);
		}
}
/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 N이 주어졌을 때, 1보다 크거나 같고, 
N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

tip
1~99의 수는 모두 한수
100미만 수 조건없이 출력하고 
100~999의 수는 자리수 구해 저장후 
등차수열인지 판별하여 개수를 더함
*/