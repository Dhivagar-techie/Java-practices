//Check whether a string is a palindrome.
public class pract68 {
    public static void main(String[] args) {
        String str = "maalam";

        int start = 0;
        int end = str.length() - 1;

        boolean point = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {

                point = false;
                break;
            }
            start++;
            end--;
        }

        if (point) {
            System.out.println("palindrom");

        } else {
            System.out.println("not palindrom");
        }

    }
}