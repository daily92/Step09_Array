package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type �� ���� �� �ִ� �� 3 �� ¥�� �迭 ��ü�� �����ؼ�
		// �������� cars ��� ������ ��ƺ�����.
		Car[] cars= new Car[3];
		
		// 2. Car ��ü�� �����ϵ�, 
		// �������� ���ڷ� "�ƿ��", "���׽ý�", "BMW" �� ���� �����ؼ�
		// ��ü�� �����Ͽ� cars �迭�� 0, 1, 2 �� �濡 ���� ��� ������.
		cars[0]= new Car("�ƿ��");
		cars[1]= new Car("���׽ý�");
		cars[2]= new Car("BMW");
		
		Car[] cars2= {new Car("�ƿ��"),new Car("���׽ý�"),new Car("BMW")};
		
		// 3. �迭�� ����� Car ��ü�� �������� �̿��ؼ�
		// drive() �޼ҵ带 ���� ȣ���� ������.
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		cars2[0].drive();
		
		Car[] a= cars;	//Car[] type
		Car b= cars[0];	//Car type
		String c= cars[0].name;	//String type
		int d= cars[0].name.length();	//int type
		System.out.println(d); //"�ƿ��" �� ���� => length= 3
		
		//debugging ��������, cars �� cars2 �� �� �濡�� 
		//���������� ��(������, id ��)�� ����־� (not value)
		//MainClass02 �� ��
		
		//Car[](Car �迭) ��ü : 2 �� (Car[] cars, Car[] cars2) 
		//Car ��ü : 6 �� (new Car())
		//String ��ü : 6 �� (" ")
		//Heap �������� ��ü�� �� 14 �� ������� (<=> id �� �� 14 �� ������)
		
		
		//Car[] cars= new Car[3]; ����
		//new Car[3] �� �������� cars �� 
		
		//cars[0]= new Car("�ƿ��"); ����
		//new Car("�ƿ��") �� �������� cars[0] ��
		//"�ƿ��" �� �������� cars[0].name �� (cars �迭�� 0 �� ���� name �̶�� �ʵ忡)
		//����ִ�.
		
		//"�ƿ��" ���� ���� ������ �����Ϸ��� cars[0]
		//"�ƿ��" �� �����Ϸ��� cars[0].name �ϸ� ��
	}
}
