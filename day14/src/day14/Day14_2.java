package day14;

public class Day14_2  {
	
public static void main(String[] args) {
	/*
	 * Runnable 인터페이스를 구현한 클래스를 정의한다
	 * Run()매서드를 실제로 구현한다 여기에 쓰레드의 작업 내용을 작성한다 
	 * 앞에서 정의한 클래스를 이용해서 Runnable 객체를 생성한다 
	 * 문제는 Runnable객체의 내부에는 start() 매서드가 존재하지 않는다 
	 * 이렇기 때문에 start()매서드를 가진 Thread객체를 생성해야 한다.다만 구현한 Run()매서드 자체는
	 * Runnable객체가 가지고 있으므로 Thread객체를 생성할때  Runnable객체를 
	 * 생성자의 매개변수로 넘겨준다 
	 * 이렇게 객체를 생성하면 생성된 Thread 객체 내부의 run()매서드는
	 * 생성자 매개변수로 넘어온 Runnable 객체 내부의 run()으로 대체된다 
	 */
	
	Runnable smiFileRunnable = new SMIFileRunnable();
	Thread thread = new Thread(smiFileRunnable);// 
	thread.start();
	int[] Array= {1,2,3,4,5};
	for(int a  : Array) {
		System.out.print("비디오프레임"+a);
		try{Thread.sleep(200);} catch(InterruptedException e) {};
	
	
		}
	}
}


class SMIFileRunnable implements Runnable{
	@Override
	public void run() {
		String[] strArray= {"하나","둘","셋","넷","다섯"};
		try{Thread.sleep(10);} catch(InterruptedException e) {};
		for(String b : strArray) {
			System.out.println("- 자막번호"+b);
			try{Thread.sleep(200);} catch(InterruptedException e) {};
		}
	}
}



