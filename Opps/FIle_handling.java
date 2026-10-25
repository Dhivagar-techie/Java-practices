import java.util.*;
import java.io.File;
public class File_handling {
    public static void main(String[] args) {
        try{

            File fi=new File("Example.txt");
            Scanner sc=new Scanner(fi);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                
            }
           
        }
        catch(Exception E){
            System.out.println("File not found");

        }
    }


    
}
