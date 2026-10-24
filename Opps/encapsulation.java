public class encapsulation {

    private String name;
    private int age;

    /*
     * public encapsulation(String con_name, int con_age) {
     * name = con_name;
     * age = con_age;
     * }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("not eligible");

        }

        else {
            this.age = age;
        }
    }

    public static void main(String[] args) {

        encapsulation obj = new encapsulation();

        obj.setName("Alice");
        obj.setAge(23);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setAge(10);

    }

}
