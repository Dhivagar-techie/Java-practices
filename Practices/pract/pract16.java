import java.util.Scanner;

public class pract16 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number :");
        int start=sc.nextInt();
        System.out.println("enter the number :");
        int end=sc.nextInt();

        for(int i=start;i<=end;i++){
            int root=(int)Math.sqrt(i);

            if(root*root==i){
                System.out.println(i);
            }
        }

    }
}