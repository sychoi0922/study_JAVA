package ch07;

class MyPoint3 extends Object {
	int x;
	int y;
	
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:" + x + ", y:" + y;
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(3, 5);
		System.out.println(p);
		
//		MyPoint3 p = new MyPoint3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println("p.x"+p.x);
//		System.out.println("p.y"+p.y);
	}

}
