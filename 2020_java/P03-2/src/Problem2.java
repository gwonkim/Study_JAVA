import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrGrade[] = new int[3]; //학생의 점수 입력 배열
		int i;
		for(i=0; i<arrGrade.length; i++) { //사용자의 점수 입력 
			System.out.print("점수 입력: ");
			arrGrade[i] = s.nextInt();
			}
		
		for(int j=0; j<arrGrade.length; j++) { //큰 수로 정리해서 배열에 저장
			for(int k=j+1; k<arrGrade.length; k++) {
				if(arrGrade[j] <= arrGrade[k]) {
					int temp = arrGrade[j]; 
					arrGrade[j] = arrGrade[k]; 
					arrGrade[k] = temp; //
				}
			}	
		}
		for(int n=0; n<arrGrade.length; n++) {
			System.out.println((n+1)+"등 : "+ arrGrade[n]);
		}
	}
}
