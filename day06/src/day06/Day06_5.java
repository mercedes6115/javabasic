package day06;

public class Day06_5 {
	public static void main(String[] args) {
		// 명시적으로 this를 붙어야하는 경우
		X x = new X();
		x.init(2, 3);
		System.out.println(x.m);
		System.out.println(x.n);
		
		Y y = new Y();
		y.init(2, 3);
		System.out.println(y.m);
		System.out.println(y.n);
		
	}
}

class X {
	int m; // 자동으로 초기값 0
	int n; // 자동으로 초기값 0
	void init(int m,int n) { // 이런경우 이름을 바꾸면 되지만 this의 사용 필요성을 확인하기 위한 예제
		m = m; // 이런경우 this 를 사용하지 않을 경우 자동으로 초기값이 설정되어 0으로 된다
		n = n;
	}
}

class Y {
	int m;
	int n;
	void init(int m,int n) { // this 는 사용하는게 좋다
		this.m = m; // y.m=2 this 자리에는 호출한 객체명이 온다 
		this.n = n; // y.n=3
	}
}