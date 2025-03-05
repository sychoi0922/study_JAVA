package ch07.pkg2;

import ch07.pkg1.MyParent;

//import ch07.pkg1.MyParent; //ctrl + shift + o 자동 import

class MyChild extends ch07.pkg1.MyParent { //import 안하면 앞에 이렇게 패키지명을 붙여줘야 함
	public void printMembers() {
//		System.out.println(prv); // 에러
//		System.out.println(dft); // 에러, 패키지가 다름
		System.out.println(prt); // OK, MyParent의 자손이어서 접근 가능 
		System.out.println(pub); // OK
	}
}

public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러
//		System.out.println(p.dft); // 에러
//		System.out.println(p.prt); // 에러, 다른 패키지의 다른 클래스이기 때문에(자손 X) 접근 불가
		System.out.println(p.pub); // OK
	}

}
