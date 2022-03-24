package day16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class Day16_1 {
	public static void main(String[] args) {
		/*1.객체 생성 방법 
		 List<Integer> aList1 = Arrays.asList(1,2,3,4); 
		 aList1.set(1,7) 1번인덱스에 7값으로 교체 -> 1,7,3,4
		 */ 
		// Arrays.asList() 매서드를 사용하여 정적 컬렉션 객체 생성 
		// 내부적으로는 배열을 먼저 생성하고 이것을 lise<E>로 래핑wrapping해 놓는다
		// 따라서 내부 구조는 배열과 동일하므로 컬렉션 객체인데도 크기 변경이 불가능하다 
		List<Integer> aList1 = Arrays.asList(1,2,3,4); 
		aList1.set(1,7); //1번인덱스에 7값으로 교체 -> 1,7,3,4
		
//		List<Integer> aList2 = new ArrayList<>();
//		List<Integer> aList3 = new ArrayList<>(30);
//		List<Integer> aList4 = new Vector<>();
//		List<Integer> aList5 = new Vector<>(30);
//		List<Integer> aList6 = new LinkedList<>();
//		List<Integer> aList7 = new LinkedList<>(); // 저장 용량 지정 불가 
		//ArrayList<E> 클래스의 주요 매서드 활용방법 
		
//		List<Integer> aList2 = new ArrayList<>();
		// 1. add(): 끝에 값을 계속 추가 python의 append
//		aList2.add(3);
//		aList2.add(4);
//		aList2.add(5);
//		System.out.println(aList2.toString()); // 3,4,5
//		// 2. add(index,value): 위치 지정 삽입  인덱스에  value을 삽입함 
//		aList2.add(1, 6);
//		System.out.println(aList2.toString()); // 3,6,4,5
//		// 3. addAll(index, List<E>): 또다른 리스트를 index번째 부터통째로 넣기 
//		List<Integer> aList3 = new ArrayList<>();
//		aList3.add(12);
//		aList3.add(32);
//		aList2.addAll(3, aList3);
//		System.out.println(aList2.toString()); //3,6,4,12,32,5
//		// 4. set(index, num): index번째 있는 요소를 num으로 바꿈
//		aList2.set(3, 999);
//		System.out.println(aList2.toString()); //3,6,4,999,32,5
//		// 5. remove(index): index번째 있는 값을 삭제
//		aList2.remove(1);
//		System.out.println(aList2.toString());//3,4,999,32,5
//		// 6. remove(new Integer(num)): 처음 등장하는 num값을 삭제 
//		aList2.remove(new Integer(999));
//		System.out.println(aList2.toString());//3,4,32,5
//		// 7. clear()
//		aList2.clear(); 
//		System.out.println(aList2.toString());
//		// 8. isEmpty(): 리스트가 비어있는지 확인
//		System.out.println(aList2.isEmpty());
//		// 9. size(): 리스트의 길이 
//		System.out.println(aList2.size());
		// 10. get(index): index번째에 있는 요소 값을 가져옴 
//		System.out.println(aList2.get(1)); // 4
		
		
		
		
		
	}

}
