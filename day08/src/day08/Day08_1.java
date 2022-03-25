package day08;

public class Day08_1 {
	public static void main(String[] args) {
		/*
		 class는 객체지향에서 가장 기본적인 요소이다. 객체 지향적 관점에서 가장 중요한 부분은 
		 '상속'이다. 상속을 이해하는 것이 객체지향적인 프로그램에서 제일 중요하다
		   상속에 대한 이해를 통해 객체 타입변환, 매서드 오버라이딩 super키워드, super()매서드등도 쉽게 이해할 수 있다.
		   
		   
		 1. 상속의 개념 -> 인간세계의 상속과 매우 유사하다 
		  부모의 자원을 원하는대로 가져다가 쓴다
		       
		  상속의 장점
		 1. 코드의 중복성 제거
		 2. 다형적 표현 가능 polymorphism
		 3. 역관계는 성립하지 않는다 ex): 학생은 사람, 직장인은 사람 --> 그렇다고 직장인은 사람이다 가 성립하는것은 아니다 
		 
		 
		 사과[] apple = {사과1, 사과2};
		 포도[] grape = {포도1, 포도2};
		 키위[] kiwi = {키워1, 키위2, 키위3};
		 
		 과일 fruit1 = new 사과();
		 과일 fruit2 = new 포도();
		 과일 fruit3 = new 키위();
		 
		 사과 포도 키위는 모두 과일이다. 따라서 '과일'이라는 부모 클래스에 만들어 각각 
		 상속 시키면 다향적 표현을 할 수 있다.
		 
		 과일[] fruits = {사과, 포도, 키위};
		 
		 
		 */
		Human h = new Human();
		h.name = "홍길동";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "가나다";
		s.age = 16;
		s.studentID = 33123;
		s.sleep(); //  Human으로부터 상속받음 자신의 기능외에 Human의 기능도 같이 사용가능함
		
		
		// Worker w = new Human(); 상속에서 역관계는성립하지 않는다
		
		
		
	}

}

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}

}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
	
}