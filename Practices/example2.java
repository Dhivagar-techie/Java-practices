class calculator {
   public int calsum(int n1,int n2){
    int sum= n1+n2;
    return sum;
    }
}
public class example2 {
    public static void main(String[] args) {

        calculator cal=new calculator();

        int res=cal.calsum(4,60);

        System.out.println(res);
        
    }
}
