package javaback;
import java.util.*;

public class Main1712 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int result = 0;
		
		if(C <= B) {  // 판매가격이 가변비용을 넘지 못할 때 -> -1
			result = -1;
		}
		else {
			result = A/(C-B)+1;
			// 손익 분기점 : 판매가격 C - 생산비용 B
			/*
			 * A+B*x < C*x
			 * A < c*x - B*x 
			 * A < (C-B)*x
			 * A/(C-B) < x 
			 * 이익을 내야 해서 +1
			 */
		}
		s.close();
		System.out.println(result);
	}
}

// 손익분기점 = 총수입 > 총비용 최초로 : 이익이 발생하는 지점 
//  A = 고정비용 B = 가변비용 (재료비, 인권비 등) C = 판매 가격 

