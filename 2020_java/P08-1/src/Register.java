//지원금 신청자의 정보
public class Register { 
	private String name; //세대주 이름
	private String number; //등록 번호
	private int family; //부양 가족 수
	private int money; // 지원금 

	public Register(String name, String number, int family, int money) {
		this.name = name;
		this.number = number;
		this.family = family;
		this.money = money;
	}
	
	void getter() { //get
		System.out.println("--------------------------");
		System.out.println("등록 번호 : " + number); 
		System.out.println("세대주 이름 : " + name); 
		System.out.println("부양가족 수  : " + family);
		System.out.println("긴급 지원금 : " + money);	
	}
}
