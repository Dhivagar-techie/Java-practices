import java.util.*;
public class FirstNonRep {
    public static void main(String[]args){

         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your variable : ");
         String vari=sc.next();

        var num=new ArrayList<String>(Arrays.asList(vari.split("")));

        for (String i:num){
            if (vari.indexOf(i)==vari.lastIndexOf(i)){
                System.out.println(i+" this is first non repeter");
                break;
            }

            
            
        }
        
    }
}
