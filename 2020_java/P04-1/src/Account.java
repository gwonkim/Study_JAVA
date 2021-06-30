public class Account { //고객의 은행 계좌 나타내는 Account class
	String name; //이름 필드
	int balance; //잔액 필드 

	//생성자
	public Account() { } 

	public Account(String name) { //생성자 : 계좌 개설 시 입금액 0인 경우 호출
		this(name, 0);
	}
	public Account(String name, int balance) { //생성자 : 계좌 개설 시 입금액이 0이 아닌 경우 호출
		this.name = name;
		this.balance = balance; 
		System.out.println(name + " 고객님의 계좌가 개설되었습니다.");
		System.out.println(name + " 고객님의 잔액: " + balance);
	}

	//메소드
	public void deposit(String name, int depo) { //입금 기능
		this.balance += depo;
		System.out.println(name + " 고객님의 계좌로 " + depo +"원이 입금되었습니다.");
	}
	public void withdraw(String name, int draw) { //출금 기능 
		this.balance -= draw;
		System.out.println(name + " 고객님의 계좌로 " + draw + "출금되었습니다.");
	}
	public void showInfo(String name) { //잔액 출력 
		System.out.println(name + " 고객님의 잔액: " + this.balance);
	}

	//main()
	public static void main(String[] args) {
		Account client1 = new Account("김지원", 10000); //고객1 객체생성
		Account client2 = new Account("JAVA"); //고객2 객체생성

		client1.deposit("김지원", 50000); //입금
		client1.withdraw("김지원", 2500); //출금
		client1.showInfo("김지원"); //잔액

		client2.deposit("JAVA", 10000); //입금
		client2.withdraw("JAVA", 3000); //출금
		client2.showInfo("JAVA"); //잔액

	}
}
