package javaback;
import java.util.*;

public class Main10872 {
	public static int fact(int num) {
		/*if (num == 1) {
			return 1;
		}
		else 
			return num*fact(num-1);
			*/ // 런타임에러 
		int result = 1;
		for(int i=num; i>=1; i--) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(fact(num));
		s.close();
	}
}
