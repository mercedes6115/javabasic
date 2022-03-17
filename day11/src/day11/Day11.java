package day11;

public class Day11 {
	public static void main(String[] args) {
		
	
	/*
	 * 예외 던지기
	 * 예외가 발생했을 때 그 위치에서 바로 예외처리를 할 수도 있지만
	 * 호출한 지점으로 예외를 던질수도 있다. throws
	 * 
	 * 예외 발생시 2가지 해결책
	 * 
	 * try-catch, 예외 던지기
	 * 
	 * 리턴타입 매서드명(뱐수) throws 예외 클래스명{
	 * }
	 */
	A a = new A();
	a.abc();
	
	
	}
	
}
/*
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");
		}catch(InterruptedException e) {
			System.out.println("예외 발생");
		}
	}
}
*/
/*
 * 2개의 매서드 abc() bcd()가 있고 bcd()매서드 내부에는 예외 발생 코드가 포함되어 있다
 * Thread.sleep()은 일반 예외가 발생할 수도 있기때문에 매서드 사용을 위해서는 
 * 반드시 예외 처리를 해야한다. 하지만 bcd() 매서드가 직접 예외처리를 하는 대신에
 * 자신을 호출한 매서드로 던지게 된다. 즉, 예외처리 의무를 자신이 호출한 매서드로 전가했다
 * 따라서 abc()매서드가 예외 처리를 해야만한다
 * 
 */
class A{
	void abc() {
		try{bcd();
		}catch(InterruptedException e) {
		}
	}
	void bcd() throws InterruptedException{
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");

		}
	}
