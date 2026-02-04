// counting sort= it is used for positive no after counting their frequency and arrange them in a sorted array //thoda km smjh aya h
import java.util.*;
public class countingsort{
    public static void count(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }
        //
        int count[]= new int[largest+1];
        for(int i=0; i<arr.length; i++){
        count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarray(int arr[]){
        for (int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
    }  
    public static void main(String args[]){
        int arr[]={1,3,4,8,1,7,2,3};
        count(arr);
        printarray(arr);
    }
}