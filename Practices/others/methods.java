class stuffs{
   public void hunters(){

        System.out.println("eat animals.........!");
    }

    public String phones(int num){

        if (num>2000){
            return "it a normal phone";
        }
        else if (num>1000){
              return "it a dummy phone";
        }
        else{
            return "invalid input";
        }
        

    }
}
public class methods {
    public static void main(String[] args) {

        stuffs st=new stuffs();
        st.hunters();

        String res=st.phones(4000);
        System.out.println(res);

        
    }
    
}
