//신청자 등록, 지원금 계산, 신청자 정보 출력 등의 기능
import java.util.*;

public class RegisterManager { 
	Scanner sc = new Scanner(System.in);
	ArrayList<Register> client = new ArrayList<Register>();

	void regist() { //신청자 등록 
		String name;
		String number;
		int family;
		int money;

		for(int i=0; i<3; i++) {
			System.out.println("=== 아래의 정보를 입력하세요. ===");
			System.out.print("세대주 이름 : ");
			name = sc.nextLine(); 
			System.out.print("부양 가족 수 : ");
			family = sc.nextInt();
			number = computerRegID(i);
			money = computeFund(family);
			Register register = new Register(name, number, family, money); //고객 객체 배열 생성
			client.add(register);
			System.out.println();
			sc.nextLine(); 
		}
		sc.close();
	}
	
	String computerRegID(int i) { // 세 자리 문자열로 구성된 등록 번호 계산 기능 
		return String.format("%03d", i+1);
	}
	
	int computeFund(int f) { //부양가족 수에 따른 지원금 계산 기능
		if(f >= 3) {
			return 100;
		} 
		else if(f == 2) {
			return 80;
		} 
		else if(f == 1) {
			return 60;
		} 
		else {
			return 40;
		}
	}

	void showAll() { //전체 신청자 정보 출력 기능 
		Iterator<Register> all = client.iterator();
		while(all.hasNext()) {
			all.next().getter();
		}
	}

	public static void main(String[] arg) { //Main()
		RegisterManager rM = new RegisterManager(); 
		rM.regist();
		rM.showAll();
	}
}
