//  binary search== in sorted array

import java.util.*;
public class Binarysearch{
    public static int binarysearchb(int number[],int key){
        int start=0,end=number.length-1;
        
        while(start<=end){
            int temp=0;
            int mid=(start+end)/2;
            // comparison
            if (number[mid]==key){
                return mid;
                temp++;
            }
            else if (number[mid]<key){
                start=mid+1;    
            } 
            else {
                end=mid-1; 
                                
            }     
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14};
        int key=11;
        System.out.println("key found at index=" +binarysearchb(number,key));

    }
}





import java.util.*;
public class Binarysearch{
    public static int binary(int[] a,int key){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // comparison
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                end=mid-1;
            }
            else{
               start=mid+1;
            }
        }
       return -1;
    }
    public static void main(String args[]){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int key=7;
        System.out.println("key found at index "+binary(a,key));
    }
}