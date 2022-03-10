package day06;

public class Day06_4 {
	public static void main(String[] args) {
		// this 키워드 (파이썬 self)
		// 모든 매서드에는 자신이 포함된 클래스의 객체를 가리키는 this 가 있다.
		// this 는 생략가능. 묵시적으로 사용된다 
		// 헷갈리면 this는 호출한 그 객체의 이름을 대신한다고 생각하면 편함
		// this 가 필요없어보이기도 하지만 명시적으로 꼭 직접 붙여줘야 할때도 있다
		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);
		
	}

}

class Z {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a; // this 키워드를 생략하면 자동으로 추가된다
		this.n = b; // this 키워드를 생략하면 자동으로 추가된다
		
	}
	void work() {
		this.init(2, 3); // this 키워드를 생략하면 자동으로 추가된다
	}
}