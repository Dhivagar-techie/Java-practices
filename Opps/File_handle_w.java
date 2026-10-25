import java.util.*;
import java.io.File;
import java.io.FileWriter;
public class File_handle_w {
    public static void main(String[] args) {

        try{
            File fil=new File("Example.txt");
            FileWriter fw=new FileWriter(fil);
            fw.write("this the new line Am i on new LIne check ");
    fw.close();
        }
        catch(Exception e){

            System.out.println("No file has Found");
        }
        
    }
    
}
