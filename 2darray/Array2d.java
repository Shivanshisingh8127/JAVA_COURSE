import java.util.*;
public class Array2d{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*  int [][]a; int[][] a; int[] []a; int a[][]; int[] a[]
        int[][] a,b= a-2d, b-2d
        int[] a[],b= a-2d, b-1d
        int[] a[],b[] = a-2d,b-2d
        int[][] a,b[]= a-2d, b-3d
        int[][] a,[]b =a-2d b- compile time error
        
        
       the array in which number of columns are not fixed that is called jagged array
       int[][] a=new int [2][];  // create jagged array
       a[0]=new int[3];
       a[1] new int[2]; 
      int[][] a={{1,2,3,4},{23,45,64},{1,3}};


     int[][] a; // declare
     int[][] a=new int[2][3]; // create 2d array
     a[0][0]=21; // initialization
     a[1][1]=23;
     int[][] a={{12,23,34},{21,45,67}};   // 2d array
    */
    int[][] a={{10,20,30,40},{3,4},{39,56,35}};
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        System.out.print(a[i][j] +" ");
      }
      System.out.println();
    } 
    System.out.println(a);
    System.out.println(a[0][1]);
    System.out.println(a.length);
    System.out.println(a[1].length);
     }
}