package day01;

public class Day01 { // class명은 반드시 파일명과 일치해야 한다 
// method는 class안에서만 선언 가능 그래서 함수밖이라는 개념이 없기 때문에 
// public -> 접근지정자 
// static -> 객체를 생성하지 않고도 실행 가능 
// main -> 자바는 반드시 1개의 main method가 있어야만 한다 .main이 시작지점 
// String[] ->배열을 의미 , args 인수를 의미
	public static void main(String[] args) {
	/*	
		System.out.println("Hello World"); //println 인쇄후 줄바꿈 의미 ln없으면 줄바꿈이 없다는 의미 
		System.out.println(3.14);
		System.out.println(4+ 3);
		System.out.println("화면"+ 3); // 문자+숫자 -> 문자열 
		System.out.println(3+5+"화면"); // 숫자 연산 이후 문자 더해줘서 문자열 
	
		// TODO Auto-generated method stub
		int a =3;
		String b ="화면 ";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(b+"출력");
		System.out.println(b+"\n"); // \n 개행문자 
		System.out.printf("%d\n",30); // \n 개행문자 
		System.out.printf("%s\n","출력"); // \n 개행문자 
		System.out.println(3+5+"안녕"+4+2); // \앞에 문자를 더해서 문자열로 변해서 4+2 는 6이 아닌 문자취급 42가 된다 
		System.out.printf("%s:%d","홍길동",15);
		 */
		// 변수명 짓기 -> 영문 대소문자 한글 사용가능 (그러나 영문 소문자 자주사용)
		// -> 특수문자는 밑줄_ 와 $ 만 사용 할 수 있다.(ex: $abc , _abc #abc(x) )
		// -> 숫자는 사용할 수 있으나 첫 글자로는 사용할 수 없다(a3  ,3a(x))
		// -> 예약어는 사용할 수 없다(int public등 )
		// -> 영문 소문자를 사용하자 (권장) 의미있는 단어를 사용 여러 단어를 사용할때는 두번째 단어부터는 첫글자는 대문자를 사용하자 (firstDay, myWork workSpace 등등)
		/*
		 {
		 	int a; // 변수 선언 시점 
		 	{
		 	 a=3;
		 	}
		 
		 } // 변수 소멸 시점 
		 */
		// boolean : true false
		// 정수 : int byte short long  (byte < short < int < long) 
		// 실수 : double float 
		// 문자 : char
		// 기본자료형은 메모리에 생성된 공간에 실제 변수값을 저장한다 
		// 반면 참조 자료형은 실제 데이터값을 메모리에 저장하고 변수 공간에는 실제 변수값이 저장된 메모리의 위치값이 저장된다
		// 크기가 작은걸 크기가 큰거에 넣으면 형변환 (casting)이 일어난다 
	}

}
// 하나의 packge에 여러 class가 있을 수 는 있다 그러나 파일명과같은 class에는 public으로 접근지정자 필수
// 그러나 하나릐 file에는 하나의 class가 있는게 정상