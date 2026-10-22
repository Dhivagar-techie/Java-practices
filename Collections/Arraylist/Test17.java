import java.util.*;
public class Test17 {
    public static void main(String[] args) {
        Integer[]arr={32,12,56,1,23,5,63,8,7};

        int k=3;
       Queue<Integer> num1=new PriorityQueue<>(Collections.reverseOrder());

       for(int i:arr){
        num1.offer(i);
       }
       
      for(int j=1;j<k;j++){
        num1.poll();
      }
       
       System.out.println(num1.poll());

    }
    
}
