public class battery{
    public static void main(String[] args) {
        int battery= 60 ;
        
        System.out.println("now Your battery percentage is "+battery);

        while (battery<100) {
            battery+= 10;
            System.out.println("now your battery percentage is "+ battery);

        }

        System.out.println("Battery Full!!!!");
    }
}
