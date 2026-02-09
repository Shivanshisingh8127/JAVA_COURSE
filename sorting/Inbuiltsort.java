/*  INBUILT SORT SYNTAX
//   import java.util.Arrays;
Arrays.sort(arr)
0(n logn)
Arrays.sort(arr, si,ei)   // ending arrays index will be greater than what we want to sort up
*/

import java.util.Arrays;
public class inbuiltsort{
    public static void printarray( int arr[]){
        for (int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
        }  
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
      //  Arrays.sort(arr);   //  inbuilt function to sort arrays in ascending order
        Arrays.sort(arr,0,3);// means start with 0 index and end at 2 index // it sorts arrys starting from 0 index and end at 2 index
        printarray(arr);
    }
} 


// Inbuilt sorting in reverse order
/* syntax
import java.util.Collections;
Arrays.sort(arr, Collections.reverseOrder())
*/
import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort{
    public static void printarray( Integer arr[]){
        for (int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
        }  
    public static void main(String args[]){
        Integer arr[]={5,8,1,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder());    // sorting in descending order
        printarray(arr);
    }
}


             