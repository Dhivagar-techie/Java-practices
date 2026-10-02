
import java.util.*;
public class  FIndSmallAndLarge{
    public static void code(int a ,int b, int c) {
       

        int largest;
        int  Smallest;
        

//largest

        if (a>=b&&a>=c){
           largest=a;
        }
        else if(b>=a&&b>=c){
           largest=b;

        }
        else{
            largest=c;
        }

//smallest
        if (a<=b&&a<=c){
          Smallest=a;
        }
        else if(b<=a&&b<=c){
           Smallest=b;

        }
        else{
           Smallest=c;
        }

        System.out.println("largest= "+largest);
        System.out.println("smallest= "+Smallest);

    }
public static void main(String[] args) {
     Scanner Sc =new Scanner(System.in);
        System.out.print("enter the number 1 : ");
        int a=Sc.nextInt();
        System.out.print("enter the number 2 : ");
        int b=Sc.nextInt();
        System.out.print("enter the number 3: ");
        int c=Sc.nextInt();

   

        code(a, b, c);


}

    
}
