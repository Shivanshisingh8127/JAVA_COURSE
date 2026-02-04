//  PROGRAM OF CALCULATOR
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          
        System.out.println("enetr 1st value");
        int a= sc.nextInt();
        System.out.println("enetr 2nd value");
        int b=sc.nextInt();
        System.out.println("enter your operator");
        char operator=sc.next().charAt(0);
       
        switch(operator){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default: System.out.println("end the process");
        }  
    }
}


