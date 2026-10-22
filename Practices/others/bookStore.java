class books{
    String name;
    String author;
    int price;
    boolean isAvailable;
}


public class bookStore {
    public static void main(String[] args) {

    books bk=new books();
    bk.name="white Nights";
    bk.author="Dyokesey";
    bk.price=150;
    bk.isAvailable=true;

    books bc=new books();
    bc.name="do things";
    bc.author="kingston";
    bc.price=190;
    bc.isAvailable=false;

    System.out.println(bc.name);
    System.out.println(bk.name);
    System.out.println(bc.price);
    System.out.println(bk.price);

        
    }
}
