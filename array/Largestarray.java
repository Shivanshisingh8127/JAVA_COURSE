//  largest number and smallest number

import java.util.*;
public class Largestarray{
    public static  int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;    //-infinity
        for(int i=0; i<number.length; i++){
            if (largest<number[i]){
                largest=number[i];          
            }
        }
        
        return largest;
    }
    public static void main(String args[]){
        int number[]={0,4,5,3,6,9,11,23,45};
        System.out.println("largest value=" +getlargest(number));
        
    }
}

// program to find minimum element in an array
import java.util.*;
public class Largestarray{
    public static void minimum(int[] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.print("found minimum element "+min);
    }
    public static void main(String args[]){
        int[] a={2,35,76,1,3,78};
        minimum(a);
    }
}
