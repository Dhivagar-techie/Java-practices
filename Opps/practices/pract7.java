//constructor
public class pract7 {
    public static void main(String[] args) {
        

        student s1=new student();
        student s2=new student();
        s2.name="harish";
        s2.age=45;
        s2.Department="eee";

        s1.display();
        s2.display();


    }
    
}

class student{
    String name;
    int age;
    String Department;

    student(){
        name="hii";
        age=23;
        Department="depaer";

    }

    void  display(){
        System.out.println(name + " name");
        System.out.println(age + "age");
        System.out.println(Department + "Department");
    }
}