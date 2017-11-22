package test.mypac;

public class Car {
	// 멤버 필드
	public String name;
	// 생성자
	public Car(String name) {
		this.name= name;
	}
	
	public void drive() {
		System.out.println(this.name + " 가 달려요~");
	}
}
