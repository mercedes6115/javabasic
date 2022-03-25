package day17;

public class Day17_4 {
public static void main(String[] args) {
	/*
	 * 
	 */
	
	A1 a1 = new A1();
	A1 a2 = new B1();  // 자식 클래스의 객체를 부모 클래스 타입으로 선언 - 업캐스팅 
	A1 a3 = new C1();  // 손자도 아버지 클래스를 통해 할아버지 클래스로 선언 가능 - 업캐스팅 
	B1 b1 = (B1)a1;
	C1 c1 = (C1)a1;
	D1 d1 = (D1)a1;
	E1 e1 = (E1)a1;
}
}
 

class A1{}
class B1 extends A1{}
class C1 extends B1{}
class D1 extends C1{}
class E1 extends B1{}