package day09;

public class Day09_1 {
public static void main(String[] args) {
	/*
	 * final 매서드와 final class
	 * 각각 최종 매서드와 클래스의 의미를 갖는다
	 * 최종 매서드의 의미는 ...상속할때 부모의 매서드를 오버라이딩 당하면 자식 클래스에서는 
	 * 매서드의 기능이 변경된다랴 final 매서드는 매서드의 기능을 변경할 수 없는 매서드
	 * 즉, 매서드를 final 선언하면 자식 클래스에서 해당 매서드를 오버라이딩 할 수 없다 (부모 클래스에서 final로 선언하면)
	 * 
	 * 
	 * class A{
	 * 		void abc(){}
	 * 
	 * 		final void bcd(){}
	 * }
	 * 
	 * 
	 * class B extends A{
	 * 		void abc() { // 부모의 abc()매서드를 오버라이딩 
	 * 		}
	 * 		패void bcd() {} // 에러발생 부모 클래스에서 final선언 했으므로 오버라이딩을 할 수 가없음 
	 * 
	 */
}
}
