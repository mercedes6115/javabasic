package day10;

public class Day10_2 {
	public static void main(String[] args) {
		/*
		 * 예외 문법은 크게 3자기로 구성된다
		 * try{
		 *		//일반 예외, 실행 예외 발생코드
		 * }
		 * catch(예외명){
		 * 		// 예외가 발생했을 때 처리
		 * }
		 * finally{
		 * 		//예외 발생 여부와는 관계없이 항상 언제나 실행
		 * }
		 */
		/*
		try {    
			System.out.println(3/0); ---> 예외 발생 ----> 자바(예외 클래스로 객제 생성)
		}catch(ArithmeticException e) { ------------>  ArithmeticException excep = new ArithmeticException();
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		}finally {
			System.out.println("프로그램 종료"); //예외가 발생하든 말든 무조건 실행된다
		}
		
		움직임을 위한 설명 절대 매서드는 아니다 하지만 매서드가 다양한 입력 매개변수 타입으로  오버로딩될 수 있는것 처럼
		catch() 블록도 예외 타입에 따라 여러개를 포함할 수 있다.
		
		try {    
			System.out.println(3/0); ---> 예외 발생 ----> 자바(예외 클래스로 객제 생성)
			int num=Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) { ------------>  //에러가 여러개일때 처리방법
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		}finally {
			System.out.println("프로그램 종료"); //예외가 발생하든 말든 무조건 실행된다
		}
		
		
		finally는 항상 실행되는 블록
		또 다른 기능으로는 리소스를 해재하는것
		더이상 사용하지 않는 자원을 반납하는 것을 의미한다
		예를 들면 파일을 열어서 사용을 한뒤 닫아야 다른 프로그램이 이 파일을 사용할 수 있다
		finally{}블록에서 리소스를 해제하는 역할로도 사용이 된다
		*/
		
		
		
	}

}
