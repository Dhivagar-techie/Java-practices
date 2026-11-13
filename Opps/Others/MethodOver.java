public class MethodOver {

    public void num(int a,int b,int c){

        int res= a+b+c;
        System.out.println(res);
    }
    public void num(int a,int b){

        int res= a+b;
        System.out.println(res);
    }
    public void num(int a,int b,double c){

        double res= a+b-c;
        System.out.println(res);
    }
    public void num(int a,int b,int c,int d){

        int res= a+b+c/d;
        System.out.println(res);
    }

    public static void main(String[] args) {
        
        MethodOver obj=new MethodOver();
        obj.num(12,3,456);
        obj.num(12,456);
        obj.num(12,3,456,10);
        obj.num(12,3,45.0);
    }
    
}
