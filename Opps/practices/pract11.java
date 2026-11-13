//Create a Student class with private variables name, age, and department. Use getters and setters to access them.
public class pract11 {
    public static void main(String[] args) {

        Student s1=new Student();

        s1.setname("arun");
        s1.setAge(23);
        s1.setDepartment("cse");

        
        

    }
    
}

class Student{

    private String name;
    private int Age ;
    private String Department;


    //setter

    public void setname(String name){
        this.name=name;

    }
    public void setAge(int Age){
        this.Age=Age;

    }
    public void setDepartment(String Department){
        this.Department=Departmente;

    }

    //getter

    public String getname(){
        return name;

    }

    public int setAge(){
        return Age;
    }
    public String getDepartment(){
        return Department;

    }

}
