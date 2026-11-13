public class ExceptionHA {
    public static void main(String[] args) {
        int x=5;
        try{
            if(x/0==0){
                System.out.println("it is divided");
            }
        }
        catch(Exception e){
            System.out.println("something went wrong!!!!!");
        }
        finally{
           System.out.println("the process as completed"); 
        }

    }
    
}
