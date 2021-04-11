package javaback;
import java.util.*;

public class Main5622 {
	public static void main(String[] args ) {
		Scanner s = new Scanner(System.in);
		
		//2941번 문제
		String [] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; 
		// ABC = 3, DEF = 4 ... *** PQRS = 8, WXYZ = 10 
		String word = s.next();  

		for(int i=0; i<croatia.length; i++) {
			word = word.replace(croatia[i], "0");
		}
		System.out.println(word.length());
		s.close();

		/*
		5622번 문제
		Scanner s = new Scanner(System.in);
		int [] alphabet = {3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,7,7, 8,8,8,8, 9,9,9, 10,10,10,10}; 
		// ABC = 3, DEF = 4 ... *** PQRS = 8, WXYZ = 10 
		String word = s.nextLine();  
		int sum = 0;
		
	 	for(int i=0; i<word.length(); i++) {
	 		sum += alphabet[word.charAt(i)-65]; //'A'=65...
	 	}
	 	System.out.println(sum);
	 	s.close();
	 	*/
	}
}

/*전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
 * 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 
 * 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 
1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 
한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
1=2초 2=3초 
상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다
. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 
예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 
이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
*/