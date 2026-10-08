import java.util.LinkedHashSet;
public class LinkedHashSet1 {
    public static void main(String[]args){
       LinkedHashSet<String> name=new LinkedHashSet<String>();
     name.add("hello");
     name.add("is this");
     name.add("your");
     name.add("dog");

     for(String i:name){
        System.out.println(i);
     }

    
    }
}
