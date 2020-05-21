package javaback;

public class Main4673 {
	public static void main(String[] args) {
		boolean [] selfNum = new boolean [10001]; //참/거짓     10000보다 작거나 같은 셀프 넘버// 생성자가 없는 숫자를 셀프 넘버라고 한다.
		for(int i=1; i<selfNum.length; i++) {
			for(int j=dddd(i); j<selfNum.length; j=dddd(j)) { //dddd(75), return 87, j=87 
				if(selfNum[j]) {
					continue; //생성자가 있는 것은 넘어가기
				}
				selfNum[j] = true; //생성자가 없는 것 

			}
			if(!selfNum[i]) {
				System.out.println(i);
			}
		}

	}

	public static int dddd(int num) { //dddd(75)= 75+7+5=87
		int number = num;  //number = 75
		while(num>0){		
			number += num%10; //75 = 75 + 5
			num /= 10; //7
		}
		number += num; //80+7 =87
		return number;  //87
	}

}
/*
 * 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 
 * 예를 들어, d(75) = 75+7+5 = 87이다.

양의 정수 n이 주어졌을 때, 
이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다. 

예를 들어,
 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 
 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 
 이런식으로 다음과 같은 수열을 만들 수 있다.

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

n을 d(n)의 생성자라고 한다. 
위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 
생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
생성자가 없는 숫자를 셀프 넘버라고 한다. 
100보다 작은 셀프 넘버는 총 13개가 있다. 
1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

배열에 저장해서 출력 ,,,


10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오
1
3
5
7
9
20
31
42
53
64
 |
 |       <-- a lot more numbers
 |
9903
9914
9925
9927
9938
9949
9960
9971
9982
9993
 */
