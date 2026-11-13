public class Addition {
      
    public int add(int a,int b){
        int c=a+b;
        return c;

    }

    public static void main(String[] args) {
        System.out.println("enter the value of A and B : ");
        
     Addition cal=new Addition();
     System.out.println(cal.add(12,45));

        
    }
    
}
