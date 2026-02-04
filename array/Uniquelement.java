// program to find single element in an array using xor 

import java.util.*;
public class Uniquelement{
    public static void unique(int[] a){
        int res=a[0];
        for(int i=1;i<a.length;i++){
            res=res^a[i];     
        }
        System.out.print("single element=" +res);

    }
    public static void main(String args[]){
        int[] a={5,3,4,5,2,3,4};
        unique(a);
    }
}