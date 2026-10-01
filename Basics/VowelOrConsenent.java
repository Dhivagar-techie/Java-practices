import java.util.*;

public class VowelOrConsenent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Vowel or Consonent :");
        String word=sc.nextLine();

        if (word.length()==1){
            char ch=Character.toLowerCase(word.charAt(0));
        
           if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               System.out.println("it is a Vowel");
           
            
             }
        
        else{
            System.out.println("it is a consonent");
        }
      
    }
      else {
            System.out.println("invalid");
        }
    }
}

