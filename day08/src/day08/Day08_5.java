package day08;

public class Day08_5 {
public static void main(String[] args) {
	//super키워드, super() 매서드
	/*
	 this 키워드와 this() 매서드 는 클래스 내부의 특정 구성 요소 (생성자, 객체)
	  자기자신 호출한 그 객체를 가리킨다 
	  생략하면 자동으로  추가해 주기도 했음 
	  이와 달리 super는 모두 부모클래스와 관련이 있다. 따라서 상속관계에서만 사용하게된다.
	  
	 */
	J j = new J();
	j.bcd(); // 오버라이딩 자식의 생성자에 우선권이 생긴다 
	
	H j1 = new J();
	j1.abc();
	}
}
class H {
	void abc() {
		System.out.println("H클래스의 abc()");
	}
}

class J extends H {
	void abc() {
		System.out.println("J클래스의 abc()");
	}
	void bcd() {
		//abc();
		super.abc(); // 이렇게 하면 부모클래스의 abc() 가 실행된다 
	}
}