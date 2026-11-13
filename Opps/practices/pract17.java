public class pract17 {
    public static void main(String[] args) {
        dog d1=new dog();
        animal a1=new animal();

        a1.eat();
        d1.eat();
    }
    
}
class animal{
    void eat(){
        System.out.println("animal will eat anythings");
    }
}
class dog extends animal{
    @Override 
    void eat(){
         System.out.println("dog will eat homefoods");
    }
}