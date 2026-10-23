//Reverse an array.
import java.util.*;

public class pract62 {
    public static void main(String[] args) {
        
        int []arr={12,23,45,567,78};


        int start=0;
        int end=arr.length-1;


        while(start<end){
           int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;

            end--;
        }

        System.out.println(Arrays.toString(arr));


        



    }


    
}