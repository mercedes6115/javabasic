package day12;

public class Day12_1 {
	public static void main(String[] args) {
		 int a = 3;
	        {
	            int b =5;
	            System.out.println(a);
	            System.out.println(b);
	        }
	        System.out.println("");
	        //System.out.println(b); 중괄호를 벗어나면서 중괄호 안에서 선언된 b는 소멸한다 

	        String a1 = "안뇽";
	        String b1 = "안뇽";
	        System.out.println(a1 == b1); // 객체간의 주소값을 비교하기 떄문에 false 
	        System.out.println(a1.equals(b1)); // 문자열 내용 비교는 equals매서드로 비교
	}

}
