package Account;

//고객의 은행 계좌 나타내는 Account class
public class Account {
	private String name; // 이름 필드  해당클레스만 접근 가능
	private int balance; // 잔액 필드
	public static int donate; // 공유 변수 donate

	public Account(String name, int balance) { 
		this.name = name;
		this.balance = balance;
		System.out.println(name + " 고객님의 계좌가 개설되었습니다.");
		System.out.println(name + " 고객님의 잔액: " + balance);
	}

	// 메소드
	public void donate(int donate) { //기부 기능
		if (donate < this.balance) {
			Account.donate += donate;
			this.balance -= donate;
			System.out.println(this.name + " 고객님이" + donate + "원을 기부하셨습니다.");
		}
		else {
			System.out.println(this.name+" 고객님의 잔액이 부족하여 기부할 수 없습니다.");
		}
		System.out.println("총 기부액: " + donate);
	}
	public void deposit(int deposite) { // 입금 기능
		this.balance += deposite;
		System.out.println(this.name + " 고객님의 계좌로 " + deposite + "원이 입금되었습니다.");
	}
	public void withdraw(int withdraw) { // 출금 기능
		if (withdraw < this.balance) {
			this.balance -= withdraw;
			System.out.println(this.name + " 고객님의 계좌로 " + withdraw + "출금되었습니다.");
		} else {
			System.out.println(this.name + " 고객님의 잔액이 부족하여 출금할 수 없습니다.");
		}
	}
	public void showInfo() { // 잔액 출력
		System.out.println(this.name + " 고객님의 잔액: " + this.balance);
	}
}
