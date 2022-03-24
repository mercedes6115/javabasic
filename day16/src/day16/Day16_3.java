package day16;

import java.util.HashSet;

public class Day16_3 {
	/*
	 * Set 컬렉션
	 * 동일한 타입의 묶음이라는 특징은 그대로 갖고 있지만 인덱스라는 정보를 포함하지 않는다 
	 * 즉 집합과 같은 컬렉션이다 인덱스가 없으므로 데이터를 중복해서 저장하면  (순서가 없다) 
	 * 꺼낼 방법이 없으므로 데이터의 중복을 허용하지 않는다 파이썬의 딕셔너리랑 같다고 생각하면 된다 
	 */
public static void main(String[] args) {
	/*
	 * HashSet 구현 클래스 
	 * 
	 */
	HashSet hash1 = new HashSet();
	HashSet hash2 = new HashSet();
	

	hash1.add("가");
	hash1.add("나");
	
	System.out.println(hash1);
	hash2.add("다");
	hash2.add("나");
	System.out.println(hash2);
	
	hash2.addAll(hash1);
	System.out.println(hash2); // 중복된 "나"는 삭제되고 합쳐진다 
	System.out.println(hash2.contains("나")); //set내부에 이 값이 있는지 확인 
	/*
	 * HashSet은 데이터의 중복을 허용하지 않는다 즉, 같은 데이터를 2개 이상 포함할 수 없다 
	 * 
	 * 
	 * 
	 * 
	 * 해시코드 - 객체의 해시코드는 객체가 지정된 주소와 관련된값으로 실제 번지 값은 아니다 
	 * 객체가 저장된 번지를 기준으로 생성된 정수형 고유값이 해시코드이다 
	 */
	// == : 두 객체의 해시코드가 동일한지를 비교 
	// equals(): 
	// System.out.println(hash2.hashCode());

}
}
