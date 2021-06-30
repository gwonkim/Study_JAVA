import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		
		int money = s.nextInt(); //����ڰ� �Է��� �ݾ� ��
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //ȯ���� ���� ����
		int [] change = new int [8]; //ȯ���� ��� �� ���� �迭 ����
		
		for(int i=0; i<unit.length; i++) {
			change[i] = money/unit[i];
			money = money%unit[i]; // money�� ����� ����� ������.
		}
		
		for(int j=0; j<change.length; j++) {		
			if(change[j] != 0) { //ȯ���� ��� ���� 0�� �ƴ� ��츸 ���
				System.out.print(unit[j] + "�� ¥��: "); //ȯ�� �� ���� ���
				System.out.println(change[j]); //ȯ���� ��� ���
				}
		}
		s.close();
	}
}
