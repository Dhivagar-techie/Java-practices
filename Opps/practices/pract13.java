public class pract13 {
    public static void main(String[] args) {

        marks m1=new marks();
        m1.vaildMarks(2);

    }

}

class marks {
    private int marks;

     public int getmarks() {
        return marks;

    }

    public void vaildMarks(int marks){

        this.marks=marks;

        if (marks<0){
            System.out.println("invalid ");
        }
        else if(marks<35){
            System.out.println("failed");

        }
        else if(marks<=100){
            System.out.println(marks+" passed in exams");
        }
        else{
            System.out.println( "cant be more than 100");
        }

    }

   
}
