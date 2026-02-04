// SORTING= it means arranging the elements of an array in an order
 // BUBBLE SORT = large elements come to the end of array by swapping with adjacent elements
 
 import java.util.*;
 public class Bubblesort{
    public static void bubble(int a[]){
        for(int turn=0; turn<a.length-1; turn++){
          int swap=0; 
            for(int j=0;j<a.length-1-turn; j++){
                if (a[j]>a[j+1]){
                    //  swap
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
            }
            for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(swap);
        }   
    }  
    public static void main(String args[]){
        int a[]={5,8,1,9,2};
        bubble(a);     
    }
 }




import java.util.*;
 public class Bubblesort{
    public static void bubble(String a[]){
        for(int turn=0; turn<a.length-1; turn++){
          int swap=0; 
            for(int j=0;j<a.length-1-turn; j++){
                if (a[j].compareTo(a[j+1])>0){
                    //  swap
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
            }
            for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(swap);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }   
    }  
    public static void main(String args[]){
        String a[]={"radha","priya","shiv","car"};
        bubble(a);     
    }
 }




 