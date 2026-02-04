// program to find kth largest element

import java.util.*;
public class Kthlargest{
    public static void kthLargest(int[] a){
        int k=5;
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }  
            }
            if(i==k-1){
                    System.out.println(a[i]);
                    break;
                }
        }
        System.out.println("5th largest element="+a[4]);
    }
    public static void main(String args[]){
        int[] a={5,8,12,7,6,21,4};
        kthLargest(a);
    }
}


// program to find kth smallest element
import java.util.*;
public class Kthlargest{
    public static void kthSmallest(int[] a){
        int k=5;
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }  
            }
            if(i==k-1){
                    System.out.println(a[i]);
                    break;
                }
        }
        System.out.println("5th smallest element="+a[4]);
    }
    public static void main(String args[]){
        int[] a={5,8,12,7,6,21,4};
        kthSmallest(a);
    }
}