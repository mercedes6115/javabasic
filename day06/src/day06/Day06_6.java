package day06;

public class Day06_6 {
	public static void main(String[] args) {
		// this 매서드 (this 키워드와는 완전 다름)
		// this() 매서드는 자신이 속한 클래스 내부의 다른 생성자를 호출할 때 사용한다
		// 1. 생성자의 내부에서만 사용한다
		// 2. 생서자의 첫 줄에 위치한다
		// 3. 두개 조건중 하나라도 지켜지지 않으면 에러가 발생한다
		
		T t1 = new T();
		System.out.println();
		T t2 = new T(3); // 생성자 오버로딩
	}

}
class T {
	T(){
		System.out.println("첫번째 생성자");
	}
	T(int a){ // 생성자 오버로딩
		this(); // 생성자의 내부에서 첫번째 생성자를 호출 
		System.out.println("두번째 생성자");
	}
}