import java.util.*;
class Linear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] Arrays={12,23,67,89,43,90,32,75,69,15};

        System.out.print("Enter the wanter number : ");
        int num=sc.nextInt();

       int flag=-1;


        for(int i=0;i<Arrays.length;i++){
            if(Arrays[i]==num){
                flag=i;
                break;
            }
        }
   
        if(flag!=-1){

            System.out.println("it was found "+ Arrays[flag]);
            
        }
        else{
            System.out.println("it was not found");
        }

        
    }

}