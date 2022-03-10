package day06;

public class Day06_1 {
	public static void main(String[] args) {
		/* 
		가변길이 method
	 	매서드 오버로딩은 입력변수의 개수 혹은 자료형에 따라서 구분된다
		만약 입력 변수로 1~100개 사이의 불특정 갯수로 입력이 들어가면 
		매서드도 100개를 만들어야 한다 
		이를 간단하게 할 수 있는 방법이 바로 가변 길이 매개변수를 사용하는 매서드다
		 */
		
		method1("1");
		method1("1","2");
		method1("1","2","3");
		
		method2("안녕","방가");
		method2("떙큐","베리","하이");
	}
	public static void method1(String...values) {
		System.out.println("길이: "+values.length);
		for(String each: values) {
			System.out.print(each+" ");
			System.out.println(" ");
		}
		
	}
	public static void method2(String...values) {
		System.out.println("길이: "+values.length);
		for(String each: values) {
			System.out.print(each+" ");
		}
		System.out.println(" ");
		
	}
	
		
	

}
