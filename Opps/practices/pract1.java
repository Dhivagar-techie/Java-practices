 class Student1 {
    String name;
    int age;
    String Department;

    void display() {
        System.out.println(name + " name");
        System.out.println(age + "age");
        System.out.println(Department + "Department");
    }

}

public class pract1{
public static void main(String[] args) {

    Student1 s1 = new Student1();

    s1.name = "dhiba";
    s1.age = 23;
    s1.Department = "comp";

    s1.display();

}
}