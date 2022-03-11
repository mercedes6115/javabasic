package day07;

public class Day07_1 {
	public static void main(String[] args) {
		// 가변길이 자료형을 이용 
		// 입력받아 그 평균값을 출력하는 매서드 
		
		C c = new C();
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
		
	}

}
class C {
	
	
	void averageScore(int...a) {
		int total = 0;
		double avg = 0;
		for(int each: a ) {
			total += each;
		}
		avg = (double)total/a.length;
		System.out.println(avg);

		
	}
}
