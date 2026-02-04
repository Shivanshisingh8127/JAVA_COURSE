//      binomial coefficient
import java.util.*;
public class Binomialcoefficient{
    public static int factorial(int a){
        int f=1;
        for(int i=1; i<=a; i++){
            f*=i;
        }
        return f;
       }
       public static float binomial(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);
        float calculate= (nfact)/(rfact*nrfact);
         System.out.println("binomaial coefficient=" +calculate);
        return calculate;
       }
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int r=sc.nextInt();
      
         binomial(n,r);
       }
}
