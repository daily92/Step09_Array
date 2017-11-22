package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type 을 담을 수 있는 방 3 개 짜리 배열 객체를 생성해서
		// 참조값을 cars 라는 변수에 담아보세요.
		Car[] cars= new Car[3];
		
		// 2. Car 객체를 생성하되, 
		// 생성자의 인자로 "아우디", "제네시스", "BMW" 를 각각 전달해서
		// 객체를 생성하여 cars 배열에 0, 1, 2 번 방에 각각 담아 보세요.
		cars[0]= new Car("아우디");
		cars[1]= new Car("제네시스");
		cars[2]= new Car("BMW");
		
		Car[] cars2= {new Car("아우디"),new Car("제네시스"),new Car("BMW")};
		
		// 3. 배열에 저장된 Car 객체의 참조값을 이용해서
		// drive() 메소드를 각각 호출해 보세요.
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		cars2[0].drive();
		
		Car[] a= cars;	//Car[] type
		Car b= cars[0];	//Car type
		String c= cars[0].name;	//String type
		int d= cars[0].name.length();	//int type
		System.out.println(d); //"아우디" 세 글자 => length= 3
		
		//debugging 돌려보면, cars 와 cars2 의 각 방에는 
		//참조데이터 값(참조값, id 값)이 들어있어 (not value)
		//MainClass02 와 비교
		
		//Car[](Car 배열) 객체 : 2 개 (Car[] cars, Car[] cars2) 
		//Car 객체 : 6 개 (new Car())
		//String 객체 : 6 개 (" ")
		//Heap 영역에는 객체가 총 14 개 만들어짐 (<=> id 가 총 14 개 생성됨)
		
		
		//Car[] cars= new Car[3]; 에서
		//new Car[3] 의 참조값은 cars 에 
		
		//cars[0]= new Car("아우디"); 에서
		//new Car("아우디") 의 참조값은 cars[0] 에
		//"아우디" 의 참조값은 cars[0].name 에 (cars 배열의 0 번 방의 name 이라는 필드에)
		//들어있다.
		
		//"아우디" 들은 방의 참조값 참조하려면 cars[0]
		//"아우디" 를 참조하려면 cars[0].name 하면 됨
	}
}
