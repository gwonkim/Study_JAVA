import java.util.Scanner;

public class Problem2 {
	

	static int centerNumber(int num1, int num2, int num3) {
		if(num1<=num2&&num1>=num3||num1>=num2&&num1<=num3) //num1�� �߰����� ��
			return num1;
		else if(num2<=num1&&num2>=num3||num2>=num1&&num2<=num3) //num2�� �߰����� ��
			return num2;
		else
			return num3; //num3�� �߰����� ��
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("3���� ������ �Է��ϼ���. ");
		
		int num1 = scanner.nextInt(); //ù ��° ����
		int num2 = scanner.nextInt(); //�� ��° ����
		int num3 = scanner.nextInt(); //�� ��° ����
		
		int center = centerNumber(num1, num2, num3); //�߰��� ���ϱ� : centerNumber
		
		System.out.println("�߰��� : " + center);
		scanner.close();
		}
}
