import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrGrade[] = new int[3]; //�л��� ���� �Է� �迭
		int i;
		for(i=0; i<arrGrade.length; i++) { //������� ���� �Է� 
			System.out.print("���� �Է�: ");
			arrGrade[i] = s.nextInt();
			}
		
		for(int j=0; j<arrGrade.length; j++) { //ū ���� �����ؼ� �迭�� ����
			for(int k=j+1; k<arrGrade.length; k++) {
				if(arrGrade[j] <= arrGrade[k]) {
					int temp = arrGrade[j]; 
					arrGrade[j] = arrGrade[k]; 
					arrGrade[k] = temp; //
				}
			}	
		}
		for(int n=0; n<arrGrade.length; n++) {
			System.out.println((n+1)+"�� : "+ arrGrade[n]);
		}
	}
}
