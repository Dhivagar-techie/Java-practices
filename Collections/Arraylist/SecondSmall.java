import java.util.ArrayList;
public class SecondSmall {
    public static void main(String[] args) {
        ArrayList<Integer> num =new ArrayList<>();

         num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);
        num.add(75);
        num.add(22);
 

        int smallest=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
       
        for (int i:num){
            if (i <smallest){
                second_small=smallest;
                smallest=i;
            }
            else if(i<second_small && i !=smallest){
                  second_small=i;
            }
        }

        System.out.println(smallest +" is the samllest");
        System.out.println(second_small +" is the second samllest");



    }
    
}
