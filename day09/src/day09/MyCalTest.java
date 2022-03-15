package day09;

public class MyCalTest {
public static void main(String[] args) {
	Calculator cal = new MyCal(); 
	int a11=cal.multiple(3, 4);
	int b11=cal.plus(3, 4);
	int c11=cal.exec(5, 6);
	System.out.println(a11);
	System.out.println(b11);
	System.out.println(c11);
	
	Calculator.exec2(3, 4); // static 객체없이도 직접 인터페이스명으로 선언하여 바로 접근 가능 
}
}
