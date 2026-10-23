//Find the sum and average of array elements.

public class pract61 {
    public static void main(String[] args) {
        
        int []arr={12,23,45,567,78};

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }


        int avg=(int)sum/arr.length;


        System.out.println(sum+" sum of array");
        System.out.println(avg+" Avg of array");

    }
}