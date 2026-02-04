//function     of a*b==
import java.util.*;
public class Multiply{
       public static int multiple(int a, int b){
        int M=a*b;
         System.out.println("multiply="+M);

        return M;     // we take integer datatype
       }
       public static void main(String args[]) {
       Scanner sc=new Scanner(System.in); 
         int a= sc.nextInt();
         int b=sc.nextInt();
        int product=multiple(a,b);
        product=multiple(6,8);
       }
}