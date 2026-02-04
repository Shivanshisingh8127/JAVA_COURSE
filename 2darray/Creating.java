//  n*m matrix= m=rows; n=column
import java.util.*;
public class creating {
    public static boolean search(int matrix[][], int key){
          for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key){
                    System.out.print( " found at cell =(" +i +"," +j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
//        creating a matrix
        int matrix[][]=new int[3][3];    //  cells= rows* columns
        int n=matrix.length;
        int m=matrix[0].length;
        
//         input
        Scanner sc=new Scanner(System.in);
          System.out.println("enter the key");
        int key= sc.nextInt();
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
        search(matrix,key);
    }
}


//   2d array save in memory
/* matrix    1 2 3           
             4 5 6
             7 8 9
