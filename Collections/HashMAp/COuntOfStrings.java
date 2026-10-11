import java.util.*;
public class COuntOfStrings {
    public static void main(String[] args) {

        String str="malayalam";
        var Variable=new ArrayList<String>(Arrays.asList(str.split("")));
        var output=new HashMap<String,Integer>();

        for (String i:Variable){
            output.put(i,output.getOrDefault(i,0)+1);
        }
        System.out.println(output);

    }
    
}
