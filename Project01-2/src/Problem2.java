import java.util.Scanner;

public class Problem2 {
	

	static int centerNumber(int num1, int num2, int num3) {
		if(num1<=num2&&num1>=num3||num1>=num2&&num1<=num3) //num1이 중간값일 떄
			return num1;
		else if(num2<=num1&&num2>=num3||num2>=num1&&num2<=num3) //num2이 중간값일 때
			return num2;
		else
			return num3; //num3이 중간값일 때
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("3개의 정수를 입력하세요. ");
		
		int num1 = scanner.nextInt(); //첫 번째 정수
		int num2 = scanner.nextInt(); //두 번째 정수
		int num3 = scanner.nextInt(); //세 번째 정수
		
		int center = centerNumber(num1, num2, num3); //중간값 구하기 : centerNumber
		
		System.out.println("중간값 : " + center);
		scanner.close();
		}
}
