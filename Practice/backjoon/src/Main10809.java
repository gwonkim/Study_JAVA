package javaback;
import java.util.*;

public class Main10809 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String alphabet = s.next();
		for(int i='a'; i<='z'; i++) {
			System.out.print(alphabet.indexOf(i)+" ");
		}
	}
}
//indexOf()함수 활용문제
//해당문자가 처음으로 등장하는 위치 리턴
//만약 해당문자열 없으면 -1 리턴 

/*
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... 
z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
 단어의 첫 번째 글자는 0번째 위치이고, 
두 번째 글자는 1번째 위치이다.

*/