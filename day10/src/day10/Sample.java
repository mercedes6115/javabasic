package day10;


interface Predator{
	String getFood(); // interface는 구현을 하지 않는다 이름과 정의만 해놓는다
	
	default void printFood() { // default 매서드는 구현을 해도 된다
							   // 오버라이딩도 가능함
		System.out.printf("my food is %s\n",getFood());
	}
	
	int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT *30;
	}

}
class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}


class Tiger extends Animal implements Predator{
	public String getFood() { // interface 매서드는 항상 public으로 구현해야 한다 
		return "apple";
	}
	
}
class Lion extends Animal implements Predator{
	public String getFood() {
		return "banana";
	}
	
}

class Crocodile extends Animal implements Predator{
	public String getFood() {
		return "strawberry";
	}
	
}
class Leopard extends Animal implements Predator{
	public String getFood() {
		return "orange";
	}
	
}
class ZooKeeper {
	void feed(Predator predator) { // 동물마다 하나씩 구현해줘야 하던걸 중복성을 제거해 하나로 표현 
								   // 동물의 종류에 의존적인 클래스에서 동물의 종류와 상관없이 독립적인 클래스가 됬다는것이 인터페이스의 특징이다 
		System.out.println("feed " + predator.getFood());
	}
//	void feed(Predator tiger) {
//		System.out.println("feed apple");
//	}
//	void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	
//	void feed(Crocodile crocodile) {
//		System.out.println("feed strawberry");
//	}
//	void feed(Leopard leopard) {
//		System.out.println("feed orange");
//	}
	
}


public class Sample {
	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger(); // 매서드 오버로딩  상속받으면 상속받은 자료형을 쓸 수 있다. interface도 가능 
		Lion lion = new Lion(); // 다향성(polymorphism): 객체가 한개 이상의 자료형을 타입을 갖게되는 특성
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard();
		// 그냥 클래스로 상속을 받으면 사용에 선택이 있지만 interface는 강제성이 부여되서 무조건 구현을 해야한다
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		zookeeper.feed(crocodile);
		zookeeper.feed(leopard);
		/*
		 * 	물리적 세계					자바세계
		 * 	컴						Zookeeper
		 * usb포트					Predator
		 * 하드디스크, 디캠				lion, tiger,,,
		 * 
		 */
		//(animal instanceof Tiger) Tiger클래스로 생성한 인스턴지인지 
		
	}
	

}
