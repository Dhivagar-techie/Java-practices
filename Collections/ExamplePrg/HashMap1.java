import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {

        HashMap<String, String> Cities = new HashMap<String, String>();

        Cities.put("hell", "heven");
        Cities.put("hel", "hevn");
        Cities.put("hel5l", "hev9en");
        

        for (String i:Cities.keySet()){
            System.out.println(i+" "+Cities.get(i));
        }
       

 System.out.println(Cities.get("heven"));

    }

}
