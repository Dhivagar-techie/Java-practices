import java.util.*;
public class swiggy_app {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Swiggy\n");
        System.out.println("Hotel\n---------\n1.Buhari\n2.A2B\n3.Amma_canteen\n4.Appa_canteen");
        System.out.print("enter your Option:");
        int opt=sc.nextInt();

        int button=opt;
        switch (button) {
            case 1  ->  {System.out.println("1.Chicken biriyani--Rs.120\n2.mutton biriyani--Rs.140\n3.Prawn_biriyani--Rs.130");}
            case 2 -> {
                        System.out.println("1. Idly - Rs.30");
                        System.out.println("2. Dosa - Rs.50");
                        System.out.println("3. Pongal - Rs.40"); }
            case 3 -> {
                System.out.println("1. Sambar Rice - Rs.60");
                System.out.println("2. Lemon Rice - Rs.50");
                System.out.println("3. Curd Rice - Rs.50");}
            case 4 -> {
                System.out.println("1. Bajji - Rs.30");
                System.out.println("2. Bonda - Rs.30");
                System.out.println("3. Tea - Rs.15");}

            default  ->  {System.out.println("Invalid Option");}
        
        }

        
        }
    }
    

