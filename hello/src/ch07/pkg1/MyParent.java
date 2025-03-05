package ch07.pkg1;

//클래스 앞에는 public과 (default)만 가능

//class MyParent { //아무것도 안붙여서 접근제어자가 (default) -> MyParentTest2에서 쓰기 위해 앞에 public 붙여줌
public class MyParent { //public이 되면서 파일이름과 일치해야 하기 때문에 파일명 변경 (MyParentTest -> MyParent)
	private	  int prv; // 같은 클래스
			  int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 자손(다른 패키지)
	public	  int pub; // 접근제한 없음
	
	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}

//public class MyParent { //원래 여기에 public이 붙어있었는데 public class는 하나만 있어야하기 때문에 이걸 default로 변경
class MyParentTest { //파일명 변경하면서 MyParent로 클래스명이 여기도 바뀌지만 MyParentTest로 다시 유지
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK

	}

}
