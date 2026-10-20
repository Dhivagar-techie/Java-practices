import java.util.*;

public class MultiArray {


    public static void main(String[] args) {

        int arr[][]=new int[3][5];
        
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i ].length;j++){
            arr[i][j]=(int)(Math.random()*100);
        }
        System.out.println();
        
    }
    System.out.println(Arrays.deepToString(arr));
    
}
}
