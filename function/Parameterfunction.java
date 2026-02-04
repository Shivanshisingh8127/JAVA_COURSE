

/*     syntax with parameters
returntype name(type parameter1, type parameter 2){             
//body          means code
return statement;
} 
*/ 

// program using parameter 
import java.util.*;
public class Parameterfunction{
     public static void sum(int a,int b){ //parameters or formal parameters written in define function
        int sum=a+b;
        System.out.println("sum=" +sum);
        return;
     }
    public static void main(String args[]) { // this is main function that execute our code in java
         Scanner sc=new Scanner(System.in);
        
         int a= sc.nextInt();
         int b=sc.nextInt();
         sum(a,b); // calling is function, actual parameters or arguements means when call function
    }
       // call by value means we give copy value not original value to the function
}