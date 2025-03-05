package ch07;

class Time {
	private int hour;
	private int minute;
	private int second;

	public void setHour(int hour) {
		if(isNotValidHour(hour)) return; //alt + shift + M 메서드 추출(if문 조건을 아래 메서드로 분리)
		
		this.hour = hour;
	}

	//매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) { 
  //public으로 해도 되지만 이 안에서만 쓰는 메서드는 private으로 해야 나중에 바꾸고 테스트시 여기서만 쓰인다는걸 알수있어서 편함
		return hour < 0 || hour > 23;
	}
	
	public int getHour() { return hour; }
	
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100;
		t.setHour(21); //hour의 값을 21로 변경
		System.out.println(t.getHour());
		t.setHour(100); //if문에서 걸려서 값 변경되지 않고 그냥 return됨
		System.out.println(t.getHour()); //21 출력
	}

}
