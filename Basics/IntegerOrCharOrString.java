import java.util.*;
public class IntegerOrCharOrString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your Inputs : ");
         String input=sc.nextLine();

         if (input.matches("[0-9]+")){
            System.out.println("it is a integer");
         }
         else if(input.length()==1 && Character.isLetter(input.charAt(0))){
            System.out.println("character");
         }
         else{
            System.out.println("string");
         }
    }

}