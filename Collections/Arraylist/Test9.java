import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        int n=9;
      Integer[]arr={1,2,3,4,5,6,8,9};
        ArrayList<Integer> num=new ArrayList<>(
            Arrays.asList(arr)
        );

        int sum=0;

        int cal=n*(n+1)/2;

        for(int i:num){
            sum+=i;
        }

        int ans=cal-sum;

System.out.println(ans);

    }
}