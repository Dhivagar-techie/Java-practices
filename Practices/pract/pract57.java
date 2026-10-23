//diamond program
public class pract57 {


    public static void main(String[] args) {
        int rows=5;
        System.out.println("diamond pattern ");
        for (int i=1;i<=5;i++){

            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
//inverted
        }
        for (int i=rows-1;i>=1;i--){

            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        
    }
    
}
