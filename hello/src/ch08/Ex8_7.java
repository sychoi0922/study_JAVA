package ch08;

class Ex8_7 {
	public static void main(String[] args) {
//		throw new Exception();		// Exception을 고의로 발생시킨다.
		// checked 예외인데 try catch 예외처리를 안해줘서 빨간 줄 뜨는 것, Exception과 그 자손은 반드시 예외처리를 해줘야 한다. (필수)
		throw new RuntimeException(); //unchecked 예외로 빨간 줄 안 뜸, 실행하면 당연히 에러
		// RuntimeException과 그 자손은 예외처리를 예외처리를 해주지 않아도 컴파일이 된다. (선택)
	}
}