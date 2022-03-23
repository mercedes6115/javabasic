package day15;

public class Day15_2 {
public static void main(String[] args) {
	/*
	 * 제네릭을 사용하면 모든 타입의 상품을 저장할수있으면서도
	 * 잘못된 캐스팅을 할때 문법 오류를 발생시키는 문제를 사전에 예방할수 있다
	 * 
	 * 
	 * 제네릭 클래스와 제네릭 인터페이스 
	 * 
	 * public class MyClass<T>{
	 * 	private T t;
	 * 	public T get(){
	 * 		return t;
	 * 		}
	 * public void set(T t){
	 * 		this.t;
	 * 		}
	 * }
	 * 
	 * 
	 * 
	 * public interface MyInterface<K,V>{
	 * public abstract void setKey(K k);
	 * public abstract void setValue(V v);
	 * public abstract K getKey();
	 * public abstract V getValue();
	 * 
	 * 제네릭 클래스 MyClass<T> 는 제네릭 타입 변수 1개를 갖고 있다
	 * 이 제네릭 타입은 필드 타입 getter매서드의 리턴타입 setter매서드의 입력타입에 사용됐다
	 * 
	 * 제네릭 인터페이스인 MyInterface<K,V>는 2개의 제네릭 타입변수를 갖고 있고
	 * 각각 setter와 getter매서드의 입력과 리턴타입으로 사용됐다.
	 * 
	 * 제네릭 클래스라고 해도 역시 클래스의  객체 생성 등의 기능을 모두 갖고 있다 
	 * 다만 클래스명 다음에 제네릭 타입을 명시한다는 점에서 차이가 있다
	 * 즉 객체를 생성할때 제네릭 타입 변수에 실제 타입을 대입하게 되는 것이다 
	 * 
	 * MyClass<String> mc2 = new myClass<String>();
	 * //String 타입을 저장하거나 꺼내올수 있는 객체로 지정 
	 * 
	 */
}
}
