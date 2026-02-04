// Array==  array is the list of elements of same data types placed in a contiguous memory location 
//   array contains only same datatypes
// types of arrays= 1. single dimensional array(1d) 2. multidimensional arrya(2d, 3d)

import java.util.*;
public class array{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
//creating an array  //syntax= datatype arrayname[]=new datatype[size];
        int marks[] = new int[50]; // size 50 means it stores  50 integer values   //  array size is inmutable at the time of running a code
        int marks[] = {2,4,5,7};    //    size =4
       String fruits[] = {"apple", "mango", "oorange"}; // size=3
       char c[]= {'a','b','d'};

 //input in arrays
        marks[0] = sc.nextInt();   // at index 0
        marks[1] = sc.nextInt();   // at ndex 1

//output in arrays
        System.out.println("p "+marks[0]);
        System.out.println("t "+marks[1]);
        marks[1]= marks[1]+4;//  update an array   
        System.out.println("t "+marks[1]);
    }
}



// printing every elment of an array
import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,6};
        // for loop
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // for each loop
       for(int i:a){
        System.out.print(i+",");
       }
    }
}
/*   int[] a, int a[], int[]a, int []a
int[] a,b
int []a,b
int a[],b
int a,b[]


// Anonymous arrays= the arrays that are used only one time and created at a single line
these arrays can be single or multidimensional array
*/
//new int[]{10,29};  // anonymous
public class Array{
    static void sum(int[] no){
        int total=0;
        for(int i=0;i<no.length;i++){
            total+=i;
        }
        System.out.println("sum is=" +total);
    }
    public static void main(String args[]){
        Array.sum(new int[]{10,23,43});
    }
}



// printing elements of 2d array
import java.util.*;
public class Array{
    public static void print(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String args[]){
        int[][] a={{23,45,13,5},{23,56,2,6}};
        print(a);
    }
}



// printing all elemnts of 3d array
import java.util.*;
public class Array{
    public static void print(int[][][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return;
    }
    public static void main(String args[]){
        int[][][] a={{{23,45},{23,56,2,6}},{{23,56,78},{49,67}}};
        print(a);
    }
}       







