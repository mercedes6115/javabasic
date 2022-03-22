package day14;
public class Day14_1  {

	
	public static void main(String[] args) {
		/*
		 * 쓰레드 실행방법
		 * 
		 * 객체를 어떤 방법으로 실행하든 쓰레드 객체 내의 start() 매서드를 호출한다
		 * 재정의한 run()의 내용을 실행하기 위해서는 반드시 start() 매서드를 호출해야한다
		 * start() 매서드로 한번 실행된 쓰레드 객체는 재사용할수 없다
		 * 다시 실행하려면 객체를 다시 생성해야만 한다 
		 * 
		 * 1. 쓰레드 클래스 상속받아서 run() 매서드를 오버라이딩
		 * step1 클래스 정의
		 * step2 객체를 생성
		 * step3 쓰레드 실행 
		 */
		Thread smiVideoThread = new VideoThread();
		smiVideoThread.start();
		
		Thread smiAudioThread1 = new AudioThread();
		smiAudioThread1.start();
		
		
		/*
		int[] Array= {1,2,3,4,5};
		for(int a  : Array) {
			System.out.print("비디오프레임"+a);
			try{Thread.sleep(200);} catch(InterruptedException e) {}; //관용적으로 try-catch로 텀을준다 
			
		*/
		}
		
		/*
		 * 
		 * 프로그램이 처음 실행될때 이미 main쓰레드가 실행되고 있으므로 이 2개의 작업을 동시에 실행하기 위해서는 
		 * 적어도 하나 이상의 쓰레드를 추가로 생성하여  실행해야 한다 
		 * 
		 * 쓰레드 클래스를 상속받아서 클래스를 정의했고
		 * 객체를 생성하여 start()매서드로 실행했다
		 * main 쓰레드와 smiFileThread를 사용하여 각각 비디오 번호와 자막번호를 출력했음
		 * 참고로 멀티쓰레드는 독립적으로 실행되기 때문에 먼저start() 매서드로 호출이 되었다 하더라도
		 * 나중에 실행된 쓰레드 보다 늦게 실행될 수 있다
		 * 이러한 이유로 자막번호가 항상 비디오 번호 뒤에 나오도록 쓰레드에 Tgread.sleep(10)을 추가함으로써
		 * 0.01초 늦게 출력되도록 했다
		 * 
		 * 
		 * 실행중인 쓰레드의 갯수 확인 
		 * Thread curThread = Thread.currentThread();
		 * curThread.getName()// 쓰레드의 이름 
		 * curthread.activeCount() // 실행중인 쓰레드의 갯수확인 
		 * 
		 * 
		 * 
		 */
}



class VideoThread extends Thread{
	public void run() {
		int[] Array= {1,2,3,4,5};
		for(int a  : Array) {
			System.out.print("비디오프레임"+a);
			try{Thread.sleep(200);} catch(InterruptedException e) {};
		}
	}
}

class AudioThread extends Thread{
	public void run() {
		String[] strArray= {"하나","둘","셋","넷","다섯"};
		try{Thread.sleep(10);} catch(InterruptedException e) {};
		for(String b : strArray) {
			System.out.println("- 자막번호"+b);
			try{Thread.sleep(200);} catch(InterruptedException e) {};
		}
	}
}
