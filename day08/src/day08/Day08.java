package day08;
import java.util.*;
public class Day08 {
	public static void main(String[] args) {
		//시험
		/*
		//q1
		int[] a = {1,2,3,4,5};
		for(int i =0; i <a.length-1; i++) {
			System.out.println(a[i]+", "+a[i+1]);
		}*/
		
		// 첫 수부터 숫자 2개씩을 더한 값이 짝수인 그 해당 숫자 2개의 인덱스 번호를 
		// 배열로 만들어 출력
		int[] a = {1,3,4,5,6};
		int[] b = new int[2];
		for(int i = 0; i < a.length - 1;i++) {
			if((a[i]+a[i+1]) % 2 ==0) {			
				b[i] = i;
				b[i+1] = i+1;
			}
		}
		System.out.println(Arrays.toString(b));
		

	}

}
