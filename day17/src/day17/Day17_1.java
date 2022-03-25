package day17;

public class Day17_1 {
	
public static void main(String[] args) {
	/*
	 * 접근 지정자 modifier 클래스, 필드, 매서드, 생성자 등에게 특징을 부여하는 문법요소
	 * 
	 * 
	 * public > protected > default > private 
	 * 
	 *  
	 *  public:    동일 패키지의 모든 클래스                      다른 패키지의 모든 클래스에서 사용가능
	 *  
	 *  protected: 동일 패키지의 모든 클래스	                    다른 클래스의 자식 클래스에서 사용 가능 
	 *  
	 *	default:   동일 패키지의 모든 클래스에서만 사용가능
	 *
	 *  private:   동일 클래스에서만 사용가능 
	 *  
	 *  변수는 private으로 선언
	 *  매서드는 public으로 선언 
	 */	
	A a = new A();
	a.abc(7); // private선언이라 직접접근은 못하고 public으로 선언된 메서드를 통해 간접적으로 접근한다 
	
	}


}

class A{
	private int a = 1;
	private String b = "연습";
	
	public void abc(int f) {
		a=f;
		b="멩";
		System.out.println(a+b);
	}
}