// Insertion sorting is a simple sorting algorithm that works the way we sort playing cards in our hands. 
// we choose one card and insert it in its position(ascending or descending order)
import java.util.*;                  // not working 
public class Insertionsort{
    public static void insertion(int[] a){
        for(int i=0;i<a.length; i++){
           int curr=a[i];
           int prev=i-1;
           while(prev>=0 && a[prev]>a[curr]){
              a[prev+1]=a[prev];
              prev--;
           } 
           a[prev+1]=a[curr];
        }
    }
    public static void main(String args[]){
        int a[]={2,5,6,1,8};
        insertion(a);
   








 }
}