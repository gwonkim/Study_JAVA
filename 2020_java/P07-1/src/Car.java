interface Vehicle {
	void accelPedal();
	void breakPedal();
}

abstract class Car implements Vehicle { //자동차를 나타내는 Car 클래스
	private String name;
	protected int speed;
	
	@Override
	public void accelPedal() { 
		System.out.println(this.getClass().getName()+" "+this.name+"의 속도를 올립니다.");
		speedUp();
	}
	@Override
	public void breakPedal() {
		System.out.println(this.getClass().getName()+" "+ this.name +"의 속도를 내립니다.");
		speedDn();
	}
	
	public Car() { }
	public Car(String name) {
		if(name == null || name.length() == 0) { //전달된 이름이 없을 때
			name = "성공회자동차";
		}
		this.name = name;
	}

	public void showSpeed() {
		System.out.println(this.getClass().getName()+" " + this.name+"의 속도는" + this.speed +"입니다.");
	}
	abstract public void speedUp();	
	abstract public void speedDn(); 
 
}

//Sedan
class Sedan extends Car{
	public Sedan(){	}
	public Sedan(String name) { 
		super(name);
	}

	@Override
	public void speedUp() {
		this.speed += 10;
	}
	public void speedDn() {
		this.speed -= 10;
	}
}

//Truck
class Truck extends Car{
	public Truck(){ }
	public Truck(String name) { 
		super(name);
	}
	
	@Override
	public void speedUp() {
		this.speed += 5;
	}
	public void speedDn() {
		this.speed -= 5;
	}
}

//SUV
class SUV extends Car{
	public SUV(){ }
	public SUV(String name) { 
		super(name);
	}
	
	@Override
	public void speedUp() {
		this.speed += 7;
	}
	public void speedDn() {
		this.speed -= 7;
	}
}
