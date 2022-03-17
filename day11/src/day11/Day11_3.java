package day11;


class FoolException extends RuntimeException{
	// 디폴트 생성자를 자동으로 만들어준다.
	// 상속을 받고 있으므로 자동으로 부모의 생성자를 호출한다  super();
}
public class Day11_3 {
		
	public void sayNick(String nick) {
		try {
		if("fool".equals(nick)) {
			throw new FoolException(); // 강제로 예외 발생  실제 에러가 발생하지는 않지만 강제로 예외를 발생시킴 
		}
		System.out.println("당신의 별명은 " + nick + " 입니다");
		}catch(FoolException e) {
			System.out.println("FoolException이 발생했습니다");
		}
	}
	public static void main(String[] args) {
		Day11_3 sample = new Day11_3();
		sample.sayNick("fool"); // 예외발생 
		sample.sayNick("genius"); // 실행조차 되지 않는다 
		
	}

}

