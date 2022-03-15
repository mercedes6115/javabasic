package day09;

public class Day09_4 {
public static void main(String[] args) {
	/*
	 * abstarct 추상
	 * abstract 매서드 - 중괄호가 없는 매서드 , 매서드의 기능이 정의되지 않는다. 그냥 ;으로 끝난다
	 * abstract 리턴타입 매서드명();
	 *  
	 * class Animal{
	 * 		void cry(){
	 * 		} // 기능을 구현하지 않음 -> 추상 매서드로 정의하는 것이	효율적이다
	 * 							   추상 매서드를 포함하는 클래스는 반드시추상 클래스로 정의해야 한다
	 * 추상 클래스도 클래스 이므로 상속도 할수 있다.
	 * 추상 클래스는 객체를 생성할 수는 없다. 완전히 구체화 되지 않았기 때문
	 * 
	 *  }
	 * 
	 * class Cat extends Animal{
	 * 		void cry(){
	 * 		System.out.println("야옹");
	 * 		}
	 * }
	 * class Dog extends Animal{
	 * 		void cry(){
	 * 		System.out.println("멍멍");
	 * 		}
	 * }
	 *  
	 * Animal animal1 = new Cat();
	 * animal1.cry();
	 * Animal animal2 = new Dog();
	 * animal2.cry();
	 *  
	 * abstract 클래스 
	 * 
	 */
	
	//Animal ani1 = new Animal(); // 추상 클래스는 객체를 만들수 없다
	Animal ani2 = new Cat(); // 추상 클래스는 객체를 만들수 없다
	Animal ani3 = new Dog(); // 추상 클래스는 객체를 만들수 없다
	
	ani2.cry();
	ani3.cry();
	/*
	 * 추상 매서드의 장점
	 * 일반 클래스를 정의했을때와 추상 클래스로 정의했을대
	 * 자식 클래스에서 매서드 오버라이딩 하는 과정에서 만약 매서드명에 오타가 발생했다고 가정하면
	 * 매서드 2개가 발생 cry(), cRy()이렇게 2개가 생성이되는데
	 * 추상 클래스는 문법오류가 발생한다 
	 */
	}
}

abstract class Animal{ // 추상 클래스 선언
	abstract void cry(); // 추상 매서드 선언 
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

