// Program to remove duplicate element form an sorted array
/*
import java.util.*;
public class Remove_duplicate{
    public static void main(String args[]){
        int[] a={1,2,2,3,3,4,5,5};
        int[] temp= new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for(int i=0;i<a.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
*/

// Program to remove duplicate element from an array using hashset
import java.util.HashSet;
public class Remove_duplicate{
    public static void main(String args[]){
        int[] a={3,5,2,2,3,5,4};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int no:hs){
            System.out.print(no +" ");
        }
    }
}
