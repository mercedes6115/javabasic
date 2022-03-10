package day06;

public class Day06 {
	public static void main(String[] args) {
		// 객체의 생성과 활용
	/*
	 객체 생성
	 클래스명 개체명 = new 생성자();
	 */
	/*
	A a = new A(); 
	a.m = 5; 
	System.out.println(a.m);
	a.print();
	*/
	/*
	A a = new A();
	a.printFieldValue();
	*/
	/* 	매서드
	 	매서드는 클래스의 기능에 해당하는 요소이다
	 	
	 	           제어자        반환타입    매서드명(인수a,인수b){
	 	}
	 	public static int sum(int a, int b){
	 	}
	 	입력값으로 int 형 a,b를 입력받아서 처리한다
	 	매서드는 관례로 소문자로만 만든다
	 	
	 	여러가지 형태의 반환타입(return type)
	 	void, int, String, double, float ,,,,
	 	
	 	매서드 호출 
	 	매서드를 사용하려면 객체를 생성해야 한다
	 	A a = new A();
	 	a.method();
	 	*/
	/*
	  	클래스 내부에 있는 매서드 끼리는 객체를 생성하지 않고도 서로 호출할 수 있다.
	 	필드 역시 클래스 내부에 모든 매서드 안에서 객체를 생성하지 않고도 사용할 수 있다.
	 	단 조건, 매서드 앞에 static이 붙어있어야 한다
	 
	// ^^같은 클래스에서 선언한 매서드 끼리는 객체를 생성하지 않고도 서로 호출할 수 있다
	print();
	int a = twice(3);
	System.out.println(a);
	double b = sum(a,5.8);
	System.out.println(b);
	*/	
		
		
	/* ++
	 매서드 오버로딩
	 오버라이딩 : 오버라이딩 하려고 하는 매서드의 이름,매개변수, 리턴값이 모두 같아야한다 
 	 오버로딩 : 매개변수의 타입, 개수가 다를경우 같은 이름을 사용해서 메서드를 정의할 수 있음
	
		print();
		print(3);
		print(3,5);
		print(4.6);
	 
		printa();
		printa(4);
	*/
	}
	/*^^
	public static void print() {
		System.out.println("안녕");
	}
	public static int twice(int k) {
		return k*2;
	}
	public static double sum(int m ,double n) {
		return m+n;
	}
	*/
	/* ++
	public static void printa() {
		System.out.println("data가 없습니다.");
	}
	public static void printa(int a) {
		System.out.println(a);
	}
	*/
}
	
/*
class A { // 1.class A에는  
	int m =3; // 3.field가 1개 있다 필드값은 3으로 초기화 되어있다.
	void print() { // 2.print라는 method 한개와
		int k =5; // 지역변수 
		System.out.println(m);

	}
}
*/
/*
class A{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue(){
		int a;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		// System.out.println(a); 필드는 초기화 하지 않아도 자동으로 초기화 되지만 지역변수는 초기화 하지않으면 초기화 오류가 발생한다
	}
}
*/
/*
	필드 field: 클래스에 포함된 변수, 객체의 속성값을 지정할 수 있다.
	필드는 지역변수와는 다른 개념이다. 지역변수는 '매서드에 포함된 변수'
	즉, 필드와 지역변수는 구분해야 한다. 클래스의 {} 내에 선언된 변수는 'field'
	매서드의 {}안에 선언된 변수는 '지역변수'이다.
	
	필드와 지역변수의 또 다른 차이점은 초기값이다.
	필드는 직접 초기화 하지 않아도 강제로 초기화된다.
	반면 지역변수는 직접 초기화 하지 않으면 저장 공간이 그대로 있어서 그냥 출력하면 오류가 발생한다.
*/
