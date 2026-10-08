import java.util.ArrayList;
public class SecondLarg {
    public static void main(String[] args) {
         
   ArrayList<Integer> num=new ArrayList<Integer>();
     
        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);

        int largest=Integer.MIN_VALUE;
        int second_Larg=Integer.MIN_VALUE;


    for (int i:num){
        if (i>largest){
            second_Larg=largest;
            largest=i;
        }
        else if(i > second_Larg && i !=largest){
            second_Larg=i;

        }

    }
    System.out.println("Largest "+largest);
    System.out.println("Second "+second_Larg);


    }
    
}
