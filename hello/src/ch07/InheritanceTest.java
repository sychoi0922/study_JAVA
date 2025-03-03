package ch07;

class MyPoint extends Object {
	int x;
	int y;
}

//class Circle extends MyPoint { //상속
//	int r;
//}

class Circle extends Object { //포함
	MyPoint p; // = new MyPoint();
	int r;
	
	Circle() {
		p = new MyPoint();
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); //ch07.Circle@15db9742
		System.out.println(c); //ch07.Circle@15db9742
	}

}
