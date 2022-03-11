package day07;

public class Day07_4 {
	
		/*
		 접근제어자, 접근지정자  는 캘래스, 필드, 매서드, 생성자 등에서
		 어떤 특징을 부여하는 문법 요소. 일종의 형용사로 생각할수 있음 
		 사용 범위를 정의하는 역할을 한다.
		 1. public : 같은 패키지 내의 모든 클래스 + 	다른 패키지의 모든 클래스에서 접근 가능
		 2. protected : 동일 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근 가능 
		 3. default : 같은 패키지 내의 모든 클래스
		 4. private : 						 같은 클래스에서만 사용 가능 
		 
		 public > protected > default > private
		 */
	

	
	void abc() { // default
		
	}
	public static void main(String[] args) {
		
		public  int a =1;
		protected  int b =2;
		int c =3;
		private  int d = 4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
	}

}
