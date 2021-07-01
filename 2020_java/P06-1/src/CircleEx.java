class Circle{
	int radius;
	public void showCircle() {
		System.out.println("반지름이 " + radius +"인 원이다.");	
	}

	public Circle(int radius) {
		this.radius = radius;
		this.showCircle();
	}
}

class ColoredCircle extends Circle {
	String color;
	public ColoredCircle(int radius, String color){
		super(radius); //슈퍼 생성자의 생성자 명시적 선택 
		this.color = color;
		this.showColorCircle();
	}
	public void showColorCircle() {
		System.out.println("반지름이 " + this.radius +"인 " + this.color +" 원이다.");
	}	
}

public class CircleEx {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "빨간색");
	}
}
