import java.util.ArrayList;
public class Duplicate {
    public static void main(String[]args){

        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> unique=new ArrayList<>();
        ArrayList<Integer> dupli=new ArrayList<>();


        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);
        num.add(75);
        num.add(22);

        for (int i:num){
            if(!unique.contains(i)){
                unique.add(i);
            }
            else{
                dupli.add(i);
            }
        }
        System.out.println(unique);
        System.out.println(dupli);
    }
    
}

