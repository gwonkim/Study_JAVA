import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String names[] = {"����: ", "����: ", "���: "};
		int num[] = new int[3];
		int sum = 0; //��
		
		for(int i=0; i<names.length; i++) { //����, ����, ��� �� �Է�
			System.out.print(names[i]);
			num[i] = s.nextInt();
		}
		
		for(int j=num[0]; j<=num[1]; j++) {  //���۰� ���� �� ������ N����� �� ���ϱ�
			if(j%num[2] == 0)
				sum += j;
		}
		System.out.println(num[0]+"���� "+num[1]+"������ "+num[2]+"�� ����� ��: "+sum);
		s.close();
	}
}