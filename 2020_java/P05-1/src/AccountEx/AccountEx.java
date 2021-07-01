package AccountEx;

import java.util.Scanner;
import Account.*; //특정 패키지의  모든 클래스 호출

//main()메소드를 실행하는 AccountEx class
public class AccountEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account [] client = new Account[3]; //Account 타입으로 레퍼런스 변수 client선언
		String name;
		int balance;

		for(int i=0; i<3; i++) {
			System.out.print("이름: ");
			name = sc.nextLine(); 
			System.out.print("입금: ");
			balance = sc.nextInt();
			client[i] = new Account(name, balance); //고객 객체 배열 생성
			sc.nextLine(); // **문제 발생 : 엔터가 str에 저장됨. 그래서 추가적으로 nextLine삽입해야 함.
		}
		sc.close();
		
		System.out.println("------------------------------------");
		client[0].deposit(10000); //입금
		client[0].withdraw(5000); //출금
		client[0].donate(1000); //기부
		client[1].withdraw(100000);  //출금
		client[2].donate(1000000); //기부
		for(int i=0; i<client.length; i++) { //잔액
			client[i].showInfo(); 
		}

	}
}