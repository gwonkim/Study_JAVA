import java.util.Scanner;

public class Problem1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time + "�� : ");
		System.out.print(hour + "�ð� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "��");
		scanner.close();
	}
}
