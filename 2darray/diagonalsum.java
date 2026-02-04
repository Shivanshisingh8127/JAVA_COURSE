import java.util.*;
public class diagonalsum{
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; i<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                sum+=matrix[i][j];
                }
            }   
             System.out.println(sum); 
        }
 
    return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,4,3},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
     System.out.println(diagonalsum(matrix));
   
     }
}