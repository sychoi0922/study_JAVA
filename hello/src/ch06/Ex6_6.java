package ch06;

class Data { int x; }

public class Ex6_6 {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10

		change(d.x); // change() : x = 1000 (이 때의 x값은 기본형 매개변수 x, d.x값은 10)
		System.out.println("After change(d.x)"); // After change(d.x)
		System.out.println("main() : x = " + d.x); // main() : x = 10 (d.x의 값)
	}

	static void change(int x) {  // 기본형 매개변수
		x = 1000; // d.x의 값을 복사한 기본형 매개변수 x의 값을 1000으로 변경
		System.out.println("change() : x = " + x); // 변수 값
	}
	
}