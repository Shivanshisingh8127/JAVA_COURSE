// program to find a prime no

import java.util.*;
public class Primefunction{
    public static void isPrime(int a){
       int temp=0;
       for(int i=2;i<=a-1;i++){
        if(a%i==0){
            temp+=i;
        }
       } 
       if(temp==0){
        System.out.print("no is prime no");
       }
       else{
        System.out.print("no is not a prime no");
       }
       return;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        isPrime(a);
    }
}


// program to find all prime no between 1 to 100
import java.util.*;
public class Primefunction{
    public static void isPrime(int a){
        int temp=0;
        for(int i=1; i<=100;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    temp+=i;
                }
            }
            if(temp==0){
                  System.out.print(i);
                }
                else{
                    System.out.print("1");
                }
        }
        return;
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            isPrime(a);
        }
    }
}


import java.util.*;
public class Primefunction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int original =a;
        int reverse=0;
        for(int i=1;a>0;i++){
            int lastdigit=a%i;
            reverse=reverse*10+lastdigit;
            a=a/10;
        }
        System.out.print(reverse);
        if(reverse==original){
            System.out.print("no is palindrome=" +reverse);
        }
        else{
            System.out.print("not palindrome");
        }
        
    }
}