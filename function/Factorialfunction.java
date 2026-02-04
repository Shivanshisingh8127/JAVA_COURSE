//factorial function
 import java.util.*;
public class Factorialfunction{
       public static int factorial(int a){
        int f=1;
        for(int i=1; i<=a; i++){
            f*=i;
        }
        System.out.println("factorial=" +f);
        return f;
       }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
       factorial(a);
     }
}
