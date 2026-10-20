import java.util.Scanner;

public class pract19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the end number: ");
        int num=sc.nextInt();


        for(int j=2;j<=num;j++){
        boolean flag=true;

        for(int i=2;i<j;i++){
            if(j%i==0){
                flag=false;
                break;
            }

        }
         if(flag){
            System.out.print(j+" ");
        }
       
    }

       

    }
    
}
