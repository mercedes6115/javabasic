package day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day16_2 {
	public static void main(String[] args) {
		/*
		 * 연결 리스트(Linked List):
		 * List<E>의 모든 공통 특징을 다 가지고 있다(동질 자료, 동적 할당, 추가/변경/삭제 모두 동일한 매서드 사용)
		 * 1. LinkedList<E>는 객체를 생성할때 저장 용량을 지정할 수 없다.
		 * 2. 내부적으로 데이터를 저장하는 방식이 조금 다르다.
		 * 모든 데이터가 서로 연결된 형태 관리된다 
		 * 데이터를 추가하거나 삭제할때는 연결리스트가 빠르다 --> ArrayList는 인덱스에 직접 접근이 가능하기때문에 
		 * 데이터에 접근할때 연결리스트는 처음부터 접근해야되기 때문에 느리다 --> 데이터의 추가or삭제 
		 */
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();


		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println(linkedlist1.size());
		System.out.println(linkedlist1.get(1)); 
		// 적용되는지만 간단히 확인
		// ArratList와 Linkedlist의 데이터 추가 시간 비교
		ArrayList aList = new ArrayList();


		for(int i =0; i<10; i++) {
			aList.add(i,i);
			System.out.println(aList.get(i));
		}


	}

}
