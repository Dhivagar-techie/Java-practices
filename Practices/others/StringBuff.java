public class StringBuff {
    public static void main(String[] args) {
        
        StringBuffer s1=new StringBuffer("Hello World");

        s1.append(" comes");
        s1.insert(6,"boys ");
        s1.reverse();
        System.out.println(s1);

    }
    
}
