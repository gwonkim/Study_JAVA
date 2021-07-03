public class CarEx { //테스트 코드
	public static void main(String[] args ) {
		Car [] vehicles = new Car[3];

		Sedan sedan = new Sedan();
		Truck truck = new Truck();
		SUV suv = new SUV(); 

		vehicles[0] = new Sedan("람보르기니");
		vehicles[1] = new Truck("볼보");
		vehicles[2] = new SUV("");

		for(int i=0; i<vehicles.length; i++) {
			for(int j=0; j<vehicles.length; j++) {
				vehicles[i].accelPedal(); //스피드 증가
			}
		}
		for(int i=0; i<vehicles.length; i++) {
			vehicles[i].showSpeed(); //스피드 출력
		}
		
		System.out.println();
		
		for(int i=0; i<vehicles.length; i++) {
			for(int j=0; j<vehicles.length-1; j++) {
				vehicles[i].breakPedal(); //스피드 감소
			}
		}
		for(int i=0; i<vehicles.length; i++) {
			vehicles[i].showSpeed(); //스피드 출력
		}
	}
}	
