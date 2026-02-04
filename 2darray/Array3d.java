import java.util.*;
public class Array3d{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /* declare
        int[][][] a;  int[] [][]a;   int[] []a[];  int [][]a[]; int []a[][];
        

    // creation of 3d array
       int[][][] a;
       a =new int[2][][];
       a[0]=new int[2][];
       a[0][0]=new int[3];
       a[0][1]=new int[2][];

       int[][][] a=new int[2][3][3];*/

       int[][][] a={{{10,20},{22,34,45},{23,56,67}}};
       for(int i=0;i<a.length; i++){
        for(int j=0;j<a[i].length;j++){
            for(int k=0;k<a[i][j].length;k++){
                System.out.print(a[i][j][k] +" ");
            }
            System.out.println();
        }
       }

    }
}