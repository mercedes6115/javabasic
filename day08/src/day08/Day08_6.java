package day08;

public class Day08_6 {
public static void main(String[] args) {
	// 모든 생성자의 첫줄에는 this , super키워드가 있어야한다
	// 없으면 자바가 자동으로 삽입한다 
	// 즉, 상속관계에 있을때 생성자를 호출하면 항상 부모 클래스의 생성자가 호출된다는 것이다 
	// 자식 클래스로 객체를 생성할 때는 부모클래스의 객체도 만들어진다 
	}
}

class U{
	void init() {
		// 500줄
	}
}

class I extends U{
	void init() {
		// 500줄
		// 다른거 100줄
	}
}
class K extends U{
	void init() {
		super.init(); // U클래스의 init 500줄짜리 그냥 가져와버림 
		// 추가로 구현하고 싶은 기능 구현 
	}
}