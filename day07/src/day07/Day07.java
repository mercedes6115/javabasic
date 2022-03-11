package day07;

public class Day07 {

	public static void main(String[] args) {
		// 생성자가 this 매서드를 사용하는 이유 
		/*
		 객체를 생성하는 것과 함께 생성자의 주요역할은 필드를 초기화 하는것
		 class A{
		 	int m1, m2, m3, m4;
		 	A(){
		 		m1 = 1;
		 		m2 = 2;
		 		m3 = 3;
		 		m4 = 4;
		 	}
		 	A(int a){ // 생성자 오버로딩
		 		m1 = a; // 두번째 생성자가 첫번쨰 생성자와 다른점
		 		m2 = 2;
		 		m3 = 3;
		 		m4 = 4;
		 	}
		 	A(int a, int b){ // 생성자 오버로딩
		 		m1 = a; // 세번째 생성자가 두번쨰 생성자와 다른점
		 		m2 = b;
		 		m3 = 3;
		 		m4 = 4;
		 	}		 	
		 	
		 	각 생성자마다 중복되는 코드를 많이 포함하고 있는데 this 매서드를 이용하여 
		 	이를 줄일 수 있다
		 	
		 */
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10,20);
		a1.print();
		a2.print();
		a3.print();

	}

}

class A{
 	int m1, m2, m3, m4;
 	A(){
 		m1 = 1;
 		m2 = 2;
 		m3 = 3;
 		m4 = 4;
 	}
 	A(int a){ // 생성자 오버로딩
 		this(); // 반드시 처음에 선언되어야 한다 
 		m1 = a; // 두번째 생성자가 첫번쨰 생성자와 다른점
// 		m2 = 2;
// 		m3 = 3;
// 		m4 = 4;
 	}
 	A(int a, int b){ // 생성자 오버로딩
 		this(a); // 이와같이 중복되는 부분을 간략하게 줄여줄 수 있다
// 		m1 = a; // 세번째 생성자가 두번쨰 생성자와 다른점
 		m2 = b;
// 		m3 = 3;
// 		m4 = 4;
 	}		
 	void print() {
 		System.out.print(m1 + " ");
 		System.out.print(m2 + " ");
 		System.out.print(m3 + " ");
 		System.out.print(m4 + " ");
 		System.out.println();
 	}
}
