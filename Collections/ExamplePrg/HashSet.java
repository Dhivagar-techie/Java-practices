import java.util.HashSet;
public class HashSet1 {
    public static void main(String[]args){
        HashSet<Integer> num=new HashSet<Integer>();
        num.add(23);
        num.add(13);
        num.add(29);
        num.add(3);
        num.add(45);
        

        num.remove(3);
        

     
            System.out.println(num.size());

    }
    
}
