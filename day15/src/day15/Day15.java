package day15;

public class Day15 {
	public static void main(String[] args) {
		//Generic 
		/*
		 * 자바에서는 다양한 종류의 클래스와 인터페이스를 제공한다
		 * 이런 클래스와 인터페이스를 내부멤버에서 활용하는 클래스를 작성할때 
		 * 제공되는 클래스나 인터페이스의 다양성만큼 많은 가지수의 클래스를 생성해야 한다 
		 * 또한 동일한 이름의 매서드가 다양한 타입의 입력매개 변수를 가질 수 있도록 하려면 
		 * 고려하는 입력매개변수의 수만큼 오버로딩을 수행해야된다 
		 * 그래서 이러한 비효율성을 한번에 해결하는데 필요한 문법요소가 Generic 이다 
		 * 
		 * class Pencil{}
		 * 
		 * class Goods{
		 * 
		 * 	private Pencil pencil = new Pencil();
		 *	public Pencil get(){
		 *		return pencil;
		 *		}
		 *	public void set(Pencil pencil){
		 *		this.pencil = pencil;
		 *		} 
		 * }
		 * 
		 * 연필을 저장 setter하고 가져오기 getter 
		 * Goods goods = new Goods;
		 * goods.set(new Pencil());
		 * Pencil pencil = goods.get();
		 * 
		 * 연필을 저장하고 관리할 수 있는 클래스로 필드가 pencil타입의 필드
		 * 이 필드값을 쓸수 있는 getter매서드, 저장하는setter매서드를 갖고있다
		 * 따라서 이 클래스의 객체를 생성함으로 연필을 저장set하고 
		 * 저장된 연필을 가져오는 get기능을 수행할 수 있다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Goods goods = new Goods();
		goods.set(new Pencil()); // Pencil타입만 가능
		Pencil pencil = goods.get();
		
		Goods2 goods2 = new Goods2();
		goods2.set(new Apple()); // Apple 타입만 가능 
		Apple apple= goods2.get();
	}

}

class Pencil{}
 
class Goods{
 
 	private Pencil pencil = new Pencil();
	public Pencil get(){
		return pencil;
		}
	public void set(Pencil pencil){
		this.pencil = pencil;
		} 
 }

class Apple{}

class Goods2{
 
 	private Apple apple = new Apple();
	public Apple get(){
		return apple;
		}
	public void set(Apple apple){
		this.apple = pencil;
		} 
 }
