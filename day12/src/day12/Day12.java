package day12;

public class Day12 {
public static void main(String[] args) {
    for(int i =1; i<=100; i++){
        int cnt=0;
        if(i%10==0){
            System.out.println(i);
        }else{
        if(i/10 ==3 | i/10 ==6 | i/10 ==9){
            cnt++;
        }
        if(i%10 ==3 | i%10 ==6 | i%10 ==9){
            cnt++;
        }if(cnt==0){
            System.out.print(i+"\t");
        }
        else{
            if(cnt ==1){
                System.out.print("짝\t");
            }else{
                System.out.print("짝짝\t");
            }
        }
    }
    }
	
	}

}
