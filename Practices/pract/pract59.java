//Find the largest element in an array.
public class pract59 {
    public static void main(String[] args) {
        
        int []arr={12,23,45,567,78};

        int large=Integer.MIN_VALUE;
        for (int i=0;i<=arr.length-1;i++){

            if(arr[i]>large){
                large=arr[i];
            }

        }
        
        System.out.println(large+"  is largets");
    }
    
}
