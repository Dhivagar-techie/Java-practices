import java.util.*;
public class Sample2 {
    public static void main(String[] args) {

        String str="malayalam";
        var Variable=new ArrayList<String>(Arrays.asList(str.split("")));
        var output=new HashMap<String,Integer>();

        for (String i:Variable){
            output.put(i,output.get(i));
        }
        System.out.println(output);

    }
    
}
