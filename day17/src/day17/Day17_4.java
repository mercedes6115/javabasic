package day17;

public class Day17_4 {
public static void main(String[] args) {
	/*
	 * 
	 */
	
	A1 a1 = new A1();
	A1 a2 = new B1();  // 자식 클래스의 객체를 부모 클래스 타입으로 선언 - 업캐스팅 
	A1 a3 = new C1();  // 손자도 아버지 클래스를 통해 할아버지 클래스로 선언 가능 - 업캐스팅 
	
	A1 a4 = new B1(); // 자식 생성자로 부모 자료형 객체 생성 
	B1 b4 = (B1)a4; // 자식 생성자로 생성했기 때문에 이런 경우는 다운캐스팅이 가능 
	
//	B1 b = new A(); // 다운 캐스팅 : 부모가 자식 타입이 될순없다 이는 위관계에 통한다 
	B1 b1 = (B1)a1;
	C1 c1 = (C1)a1;
	D1 d1 = (D1)a1;
	E1 e1 = (E1)a1;
	
	/*
	 * 
	 * 클래스 상속 레벨기준 
	 * 자료형 > 생성자 : 업캐스팅
	 * 자료형 < 생성자 : 다운캐스팅
	 */
}
}
 

class A1{}
class B1 extends A1{}
class C1 extends B1{}
class D1 extends C1{}
class E1 extends B1{}