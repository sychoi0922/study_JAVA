package ch06;

class Data2 { int x; }

public class Ex6_7 {
	
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10

		change(d); // change() : x = 1000
		System.out.println("After change(d)"); // After change(d)
		System.out.println("main() : x = " + d.x); // main() : x = 1000
	}

	static void change(Data2 d) { // 참조형 매개변수
		d.x = 1000; // 실제 d.x의 값을 1000으로 변경
		System.out.println("change() : x = " + d.x);
	}
	
}