import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9,10};

        System.out.println("enter your target: ");
        int target=sc.nextInt();

        int low=0;
        int high=arr.length-1;
        int found=-1;
      

        while (low<=high) {

              int mid=low+(high-low)/2;

              if(arr[mid]==target){
                found=mid;
                break;
              }

              else if(arr[mid]<target){
                low=mid+1;

              }
              else{
                high=mid-1;
              }
            }

            if(found!=-1){
                System.out.println("it was found");
          
            }
            else{
                System.out.println("not found");
               
            }
        
    }
    
}
