import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String names[] = {"시작: ", "종료: ", "배수: "};
		int num[] = new int[3];
		int sum = 0; //합
		
		for(int i=0; i<names.length; i++) { //시작, 종료, 배수 값 입력
			System.out.print(names[i]);
			num[i] = s.nextInt();
		}
		
		for(int j=num[0]; j<=num[1]; j++) {  //시작과 종료 수 사이의 N배수의 합 구하기
			if(j%num[2] == 0)
				sum += j;
		}
		System.out.println(num[0]+"부터 "+num[1]+"까지의 "+num[2]+"의 배수의 합: "+sum);
		s.close();
	}
}