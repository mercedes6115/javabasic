package day14;

public class Day14 {
public static void main(String[] args) {
	/*
	 * thread(쓰레드): 규모가 작은 프로젝트라도 쓰레드를 사용하지 않을때가 거의 없음
	 * 프로그램을 작성하다 보면 어쩔수 없이 동시에 수행해야 하는 일들이 있다
	 * ex): 비디오 재생 프로그램-> 화면 재생과 오디오 재생이 동시에 일어나야함 
	 * 예와같이 여러개의 작업이 동시에 수행되도록 하기위해서 한정된 cpu를 여러개의 작업으로 나누어 사용해야 하는데
	 * 이것이 쓰레드이다
	 * 멀티태스킹이랑은 살짝다름 -> 다른 프로그램의 작업 
	 * 쓰레드 -> 하나의 프로그램에서 여러작업 
	 * 
	 * 
	 * 프로그램 & 프로세스 & 쓰레드
	 * 프로그램: 하드디스크에 저장된 파일들의 모음,컴퓨터에서 어떤 작업을 위해 실행할 수 있는 '정적인 상태'의 파일
	 * 프로세스: 메모리상에 로딩된 프로그램,프로그램이 실행되서 돌아가고 있는 상태, 컴퓨터에서 연속적으로 실행되고 있는 '동적인 상태'의 컴퓨터 프로그램
	 * 프로세스는 최소 하나 이상의 스레드를 포함한다.
	 * 프로세스는 스레드의 컨테이너이다. 스레드의 정보를 담고있는 것에 불과하다.
	 * 멀티 프로세스: 동일한 프로그램을 메모리에 2번 이상 로딩
	 * 쓰레드 : 프로세스 내부에서 독립적으로 실행되는 하나의 작업 단위
	 * 쓰레드(thread)는 프로세스가 할당 받은 자원을 이용하는 실행 단위이자, 프로세스의 특정한 수행 경로이자 프로세스 내에서 실행되는 여러 흐름의 단위
	 * .class를 실행하면 자바 가성 머신은 main쓰레드를 생성한다
	 * 즉, 프로그램이 처음 실행되면 시작 지점에 main 쓰레드 하나만 존재한다
	 * main() 메서드에서 작성한 내용바로 main 쓰레드에서 동작한다
	 * 근데 만약 main 쓰레드 내부에서 2개의 쓰레드를 생성해서 실행하면 2개의 쓰레드가 동작하게 되는데 이것을 멀티 쓰레드 프로세스라고 한다
	 * 
	 * 
	 * 멀티 쓰레드: 2개 이상의 쓰레드가 동시에 cpu를 사용한다는 의미
	 * 멀티 쓰레드의 필요성: 시스템 자원 소모 감소 (자원의 효율성 증대)
					    프로세스를 생성하여 자원을 할당하는 시스템 콜이 줄어들어 자원을 효율적으로 관리할 수 있다.
					    시스템 처리량 증가 (처리 비용 감소)
				             스레드 간 데이터를 주고 받는 것이 간단해지고 시스템 자원 소모가 줄어들게 된다.
					    스레드 사이의 작업량이 작아 Context Switching이 빠르다.
                                                 간단한 통신 방법으로 인한 프로그램 응답 시간 단축
                                                 스레드는 프로세스 내의 Stack 영역을 제외한 모든 메모리를 공유하기 때문에 통신의 부담이 적다.
	 * 멀티 쓰레드는 동시성 또는 병렬성을 가지고 처리된다.
	 * 
	 * 
	 * 
	 * 쓰레드 생성방법
	 * 
	 * 
	 * 
	 * 1. 쓰레드 클래스를 상속받아서 run() 매서드를 오버라이딩 하는방법
	 * 
	 * 1단계 - Runnable 인터페이스를 구현 Runnable 객체를 생성
	 * 2단계 - 1단계에서 생성한 Runnable객체를 생성자에 전달해준다 (이는 오버라이딩과 같은 의미)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

	
}
}



