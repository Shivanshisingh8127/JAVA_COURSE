//    finding largest and smallest nbr in a matrix
import java.util.*;
public class Largest{
    public static int  largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;   
          for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
             }
          }
         System.out.println("smallest no=" +smallest); 
         System.out.println("largest no=" +largest);   
         return largest;
    }
    public static void main(String args[]){
//        creating a matrix
        int matrix[][]=new int[3][3];    //  cells= rows* columns
        int n=matrix.length;
        int m=matrix[0].length;
        
//         input
        Scanner sc=new Scanner(System.in);      
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
//          output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        largest(matrix);
    }
}
