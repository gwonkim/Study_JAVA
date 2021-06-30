import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		
		int money = s.nextInt(); //사용자가 입력한 금액 값
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 단위
		int [] change = new int [8]; //환산한 결과 값 저장 배열 생성
		
		for(int i=0; i<unit.length; i++) {
			change[i] = money/unit[i];
			money = money%unit[i]; // money는 계산한 결과의 나머지.
		}
		
		for(int j=0; j<change.length; j++) {		
			if(change[j] != 0) { //환산한 결과 값이 0이 아닐 경우만 출력
				System.out.print(unit[j] + "원 짜리: "); //환산 돈 단위 출력
				System.out.println(change[j]); //환산한 결과 출력
				}
		}
		s.close();
	}
}
