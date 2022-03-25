package day17;

public class Day17_2 {
public static void main(String[] args) {
	/*
	 * static 제어사
	 * 클래스 멤버에서 사용하는 제어자
	 * 객체를 생성하지 않고도 클래스면.멤버명으로 직접 접근하여 사용할 수 있다.
	 * 물론 객체를 생성하고도 사용할 수 있다.
	 * 
	 * 
	 * 
	 */
	B.r = 114; // 이런식으로 객체없이도 직접 접근이 가능하다 
	System.out.println(B.r);
	
	B b1 = new B();
	B b2 = new B();
	
	b1.r=32;
	b2.r=666; 
	System.out.println(b1.r);
	System.out.println(b2.r);
	
	B.r=78; // 클래스로 보면 모든 static변수를 객체들이 공유한다
	System.out.println(B.r);
	System.out.println(B.r);
	
	//static이 걸려있는 변수 static이 걸린매서드 만 쓸수있다
	
	
	
	
}
}

class B{
	int m=4;
	static int r =66;
	
}
