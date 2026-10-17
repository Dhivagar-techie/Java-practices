import java.util.*;
public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your palindrom :");
        String num=sc.next();

        ArrayList<String> word=new ArrayList<>(Arrays.asList(num.split("")));
        ArrayList<String> rev=new ArrayList<>();

        for(int i=word.size()-1;i>=0;i--){
            rev.add(word.get(i));
        }

        if(word.equals(rev)){
            System.out.println("it is paliandrom");
        }
        else{
            System.out.println("it is not");
        }
    }
}
