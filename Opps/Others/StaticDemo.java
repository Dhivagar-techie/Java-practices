public class StaticDemo {

    // 1. Static Variable
    static int staticValue;

    // 2. Static Block
    static {
        System.out.println("👉 1. Static block executed. Class loaded into memory.");
        staticValue = 500; // Complex logic can go here
    }

    // 3. Instance Initialization Block (runs for every new object)
    {
        System.out.println("👉 3. Instance block executed. Preparing to create an object.");
    }

    // 4. Constructor
    public StaticDemo() {
        System.out.println("👉 4. Constructor executed. Object successfully created.");
    }

    public static void main(String[] args) {
        System.out.println("👉 2. Main method started.");
        System.out.println("Static value is: " + staticValue);
        
        System.out.println("\n--- Creating Object 1 ---");
        StaticDemo obj1 = new StaticDemo();

        System.out.println("\n--- Creating Object 2 ---");
        StaticDemo obj2 = new StaticDemo();
    }
}