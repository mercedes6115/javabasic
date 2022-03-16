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
		
		try {
			System.out.println(3/0);
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다");
		}finally {
			System.out.println("프로그램 종료"); //예외가 발생하든 말든 무조건 실행된다
		}
	}

}
