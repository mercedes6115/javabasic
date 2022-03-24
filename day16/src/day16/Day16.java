package day16;

import java.util.ArrayList;
import java.util.List;

public class Day16 {
	/*
	 * Collection Framework 
	 * 여러 데이터를 수집해 놓은 자료구조 
	 * 컬렉션의 가장 큰 특징: 데이터 저장 공간의 크기가 동적으로 변화한다는 것 
	 * 
	 * 컬렉션의 개념과 구조 
	 * List<E> 컬렉션 인터페이스 
	 * Set<E> 컬렉션 인터페이스 
	 * Map<K,V> 컬렉션 인터페이스 
	 * Stack<E> 컬렉션 인터페이스
	 * Queue<E> 컬렉션 인터페이스
	 * 
	 * 
	 * 
	 * 동일한 타입을 묶어 관리하는 자료구조
	 * 배열은 동일한 타입의 데이터를 묶어 관리하지만 저장공간이 정해져 있기 때문에 컬렉션은 아니다 
	 * 컬렉션은 메모리가 허용하는한 저장 데이터의 공간에 제약이 없음 
	 * 
	 * 라이브러리: 일반적으로 단순히 연관된 클래스와 인터페이스들의 묶음
	 * 프레임워크: 클래스 또는 인터페이스를 생성하는 과정에서 설계의 원칙 또는 구조에 따라 클래스 
	 * 또는 인터페이스를 설계하고 이렇게 설계된 클래스와 인터페이스를 묶어놓은 개념 
	 * 
	 * 컬렉션 프레임워크는 리스트,스택,큐,트리 등 정렬 탐색 등의 알고리즘을 구조화해놓은 프레임워크
	 * 
	 * 
	 * List<E> 컬렉션 인터페이스 
	 * 리스트는 배열과 가장 비슷한 구조를 가지고 있는 자료구조 
	 * 배열과 리스트의 가장 큰 차이점은 저장공간의 크기가 동적이냐 정적이냐의 차이 리스트는 동적 
	 * List<String> aList = new ArrayList<>();
	 * aList.add("a");
	 * aList.add("b");
	 * aList.add("c");
	 * aList.add("d");
	 * aList.add("e");
	 * 
	 * System.out.println(aList.size());  5
	 * aList.remove("c"); 원하는 요소 삭제
	 * System.out.println(aList.size());  4
	 * 
	 * // 리스트 생성
	 * 리스트는 인터페이스이기 때문에 객체를 스스로 생성할 수 없다
	 * 따라서 객체를 생성하기 위해서는 List<E>를 구현 받아서 자식 클래스를 생성하고 
	 * 생성한 자식클래스를 이용해서 객체를 생성해야된다 
	 * 하지만 컬렉션 프레임워크를 이용할때는 직접 인터페이스를 구현하지 않아도 된다 
	 * 컬렉션 프레임워크 안에 이미 각각의 특성, 목적에 맞는 클래스가 구현되어 있다 
	 * List<E> 인터페이스를 구현한 대표적인 클래스로는 크게
	 * ArrayList<E>
	 * Vector<E>
	 * LinkedList<E> 가 있다. 이 구현된 클래스들을 이용하여 List<E>객체를 생성할 수 있다.
	 * 
	 * List<E> 자체가 제네릭 인터페이스이기 때문에 이를 구현한 클래스들도 제네릭 클래스이다
	 * 즉, 객체를 생성할때 타입을 지정해야만 한다 
	 * 제네릭이기 때문에 꺼내는 작업시 고려할 필요가 없다 데이터 자료형을 지정해줬기 때문 
	 * 
	 * 
	 * 1.객체 생성 방법 
	 * List<Integer> aList1 = Arrays.asList(1,2,3,4); 
	 * aList1.set(1,7) 1번인덱스에 7값으로 교체 -> 1,7,3,4
	 * 
	 * 
	 */
	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		
		System.out.println(aList.size());  //5 리스트 길이 구하는 매서드 
		aList.remove("c"); //원하는 요소 삭제
		System.out.println(aList.size());  //4
		

		
	}

}
