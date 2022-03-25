package day17;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Day17 {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,3,4},{5,1,2}};
		int[][] c = new int[2][3];
		
		if(addMatrix(a,b,c)) {
			System.out.println("행렬a");
			print(a);
			System.out.println("행렬b");
			print(b);
			System.out.println("행렬c");
			print(c);
		}
		

		 }
		    	 
		  static boolean addMatrix(int[][] x,int[][] y, int[][] z){
		    if(x.length != y.length || y.length != z.length) {
		    	return false;
		    }
		    for(int i=0;i<x.length;i++) {
		    	for(int j=0; j< x[i].length;j++) {
		    		z[i][j] = x[i][j]+y[i][j];
		    	}
		    }
		    
		    return true;
		    }
		
		  
		  static void print(int w[][]) {
			    for(int i=0;i<w.length;i++) {
			    	for(int j=0; j< w[i].length;j++) {
			    		System.out.print(w[i][j]+ " ");
			    		
			    	}
			    	System.out.println();
			    }
		  }
		  
		  
		    	   
}


