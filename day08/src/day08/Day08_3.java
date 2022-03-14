package day08;

public class Day08_3 {
	public static void main(String[] args) {
		// 매서드 오버라이딩
		// 부모 클래스에게 상속받은 매서드와 동일한 이름의 매서드를 재 정의하는것 
		// 1. 부모 클래스의 매서드와 타입과 갯수가 완전히 동일해야 한다 
		// 2. 부모 클래스의 매서드 보다 접근 지정자의 범위가 같거나 넓어야 한다.
		/*
		 class A {
		 void print(){
		 System.out.println("A클래스");
		 }
		 }
		 
		 class B extends A{
		 void print(){
		 System.out.println("B클래스");
		 }
		 }
		 
		 오버라이딩을 덮어쓰기라고 표현은 했지만 사실 차이는있다.
		 덮어씌기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념 
		 오버라이딩은 이전 부모의 매서드 위에 새로운 매서드가 위에 덮어지는 개념 원본이 삭제되지는 않는다 
		 부모의 매서드를 강제로 호출할 수도있다.
		 
		 매서드 오버라이딩을 사용하는 이유 
		 
		 모든 객체를 부모 타입 한가지로 선언하면 배열로 한번에 관히 할수 있다는 장점이 있다
		 */
		Q q = new Q();
		q.print();
		W w = new W();
		w.print();
		
		Q qw = new W(); // 자식 생성자에 부모 자료형으로 객체 생성
		qw.print(); // 자료형이 부모라도 생성자가 자식 생성자라 생성자가 우선시 된다 
		
		
	}

}


class Q {
void print(){
System.out.println("Q클래스");
	}
}

class W extends Q{
void print(){
System.out.println("W클래스");
	}
}