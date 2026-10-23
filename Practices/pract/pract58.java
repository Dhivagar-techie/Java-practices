//Print a hollow square.
//Print a square of stars.
public class pract58 {
    public static void main(String[] args) {
        System.out.println("hollow square");

        int row=5;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==1||i==row||j==1||j==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }
    
}
