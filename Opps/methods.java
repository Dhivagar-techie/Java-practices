public class methods {

    public void playmusic(int a){
        if(20<a)
        System.out.println("i will play");
        else{
            System.out.println("i wont");
        }

    }

    

    public static void main(String[] args) {

        methods obj=new methods();

        obj.playmusic(100);
        
    }
    
}
