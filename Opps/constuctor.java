public class constuctor {

    int year;
    String name;

    public constuctor(int caryear,String modelname){
        System.out.println("this just testing");
        year=caryear;
        name=modelname;

    }


    public static void main(String[] args) {

        constuctor obj=new constuctor(2004,"mustang");

        System.out.println(obj.year);
        System.out.println(obj.name);

        
        
    }
    
}
