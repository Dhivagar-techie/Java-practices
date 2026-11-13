public class pract3 {
    public static void main(String[] args) {
        

        Rectangle rc=new Rectangle();

        rc.length=23;
        rc.breath=34;

        rc.area();

    }


}


class Rectangle{

 int length;
 int breath;

    void area(){
        System.out.println(length*breath);
    }

}