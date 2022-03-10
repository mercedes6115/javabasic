package day06;

public class Day06_2 {
	public static void main(String[] args) {
		// 생성자 constructor
		// 객체를 최초 생성할 때 자동으로 호출되어 실행된다
		
		// 1. 생성자는 반드시 class명과 동일한 이름이여야 한다
		// 2. 생성자는 return type도 없고 return도 없다
		
		// 지금까지는 따로 생성자를 만들지 않아도 정상적으로 객체가 실행됬던 이유는 
		// 자바가 기본 생성자 default constructor를 자동으로 생성해주기 때문이다 
		// 생성자가 하나라도 있으면 자바는 기본생성자를 추가로 만들지 않는다 
		A a = new A();
		B b = new B();
		//C c = new C(); // 에러발생,  생성자에 int 를 매개변수로 넣게 되어있다
		C c = new C(3);
		a.work();
		b.work();
		
	}
	
}
class A {
//	A(){ // 개발자가 직접 생성자를 만들지 않으면 자바가 자동으로 default 생성자를 만들어준다 
//		
//	}
	int m;
	void work() {
		System.out.println(m);
	}
}

class B {
	B(){
		// 아무런 기능이 없는 default 생성자 
	}
	int m;
	void work() {
		System.out.println(m);
	}
}

class C {
	C(int a){ // 직접 생성자를 만들어야 하는 경우
		m = a;
		
	}
	int m;
	void work() {
		System.out.println(m);
	}
}

