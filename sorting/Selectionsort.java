// selection sort= pick up the smallest and put it at the beginning     
import java.util.*;
public class Selectionsort{
     public static void selection(int a[]){
        for(int i=0;i<a.length; i++){
        
            int min=i;
            for (int j=i+1; j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
                 // swap 
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp; 
        
        }
         for (int k=0; k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
        }        
    
    public static void main (String args[]){
        int a[]= {2,1,9,8,3};
        selection(a); 
        System.out.println(a.length);    
    }
}