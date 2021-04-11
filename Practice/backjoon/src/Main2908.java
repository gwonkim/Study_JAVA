package javaback;
import java.util.*;

public class Main2908 {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String answer = s.nextLine();
	 String [] array = answer.split(" ");
	
	 int a=Integer.parseInt(array[0]), b=Integer.parseInt(array[1]);
	 int newA = (a%10)*100 +((a%100)/10)*10 + (a/100);
	 int newB = (b%10)*100 +((b%100)/10)*10 + (b/100);
	 // a= 456      6*100         5*10              4
	
	// 방법 1
	if(newB <= newA) {
		System.out.println(newA);
	}
	else {
	 System.out.println(newB);
	}  
	
	//방법 2
	
	System.out.println(newA > newB ? newA : newB);
	
	
	s.close();
 }
}
/*
문제 
 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
 예를 들어, 734와 893을 칠판에 적었다면, 
 상수는 이 수를 437과 398로 읽는다. 따라서, 
 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

*/

