 //ques 1  program of table of 3
 
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);  
       
         System.out.println("enter no");
         int n=sc.nextInt();
         int i=1;
         while(i<n){
             System.out.print(" "+3*i);
               i++;
         }
         System.out.println("loop end");
    }
}
         


//ques 2    a to z letters
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);  
        for(int i=0; i<27;i++){
            char ch='a';
           ch+=i;
                System.out.print(" " +ch);
       }
    }
}


//ques 3   z to a letters
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
    int i =0;
    while(i<27){
    char c='z';
    c-=i;
    i++; 
    System.out.print(" " +c);
    }
    }
}


  //ques 4     program to print all even no between 1 to 100
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
          for(int i=1; i<=100; i++){
            if (i%2==0){
                System.out.print(" " +i);   
            }  
          }
    }
}   
          


//ques 5   sum of all natural no between 1 to n
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();
        int i=0;
        int sum=0;
         while(i<=n){
           sum=sum+i;
             i++;  
         }  
         System.out.print(sum); 
    }
}


//ques 6  program of sum of all even no from 1 to n
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
           int n=sc.nextInt();
           int sum=0;
           int i=1;
           while(i<=n){
            if (i%2==0){
                sum=sum+i;
            }
            i++;
           }
            System.out.println( "sum of first even no=" +sum);
    }
}


// ques 7    sum of all odd no from 1 to n
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
           int n=sc.nextInt();
           int sum=0;
           for(int i=0; i<=n;i++){
            if (i%2 !=0){
            sum=sum+i;
            }
           }
           System.out.println(" sum of all odd no=" +sum);
    }
}


//ques 8   factorial of a no
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
           int n=sc.nextInt();
           int factorial=1;
           int i=1;
           do{
            factorial=factorial*i;
            i++;
           }while(i<=n);
           System.out.println(" factorial of the gieven num=" +factorial);
    }
}


//ques 9    sum of all digits of a no  
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
          int n=sc.nextInt();
          int digitsum=0;
          int i=0;  
          while(n>0){
            int lastdigit=n%10;
            digitsum=digitsum+lastdigit;
             n=n/10;
            i++;    
          }
         System.out.println(digitsum);     
    }
}


//ques 10    program of find value divisible by 9 and add all sum from 100 to 200
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
          int sum=0;
          for (int i=100; i<=200; i++){
            if (i%9==0){
                sum=sum+i;
                System.out.print(" " +i);
            }
          }
          System.out.println(" sum of all values divided by 9= " +sum);
    }
}


//ques 11 input a no and find sum of all evendigits and odddigits seperately
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
         int n=sc.nextInt();
         int evensum=0;
         int oddsum=0;
         for(int i=0; n>0; i++){
            int digit=n%10;
            if (digit%2==0){
                evensum=evensum+digit;
            }
            else {
                oddsum=oddsum+digit;
            }
            n=n/10;   
         }
         System.out.println("sum of evendigit=" +evensum);
         System.out.println("sum of odddigit=" +oddsum);
    }
}


//ques 12 program to reverse a number
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        int reverseno=0;
        for (int i=0;n>0 ;i++){
            int digit=n%10;
            reverseno=reverseno*10+digit;
            n=n/10;
        }
        System.out.println("reverse numver="+reverseno);
    }
}


//ques 13  program to count digits of a no
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        int countdigits=0;
        for(int i=0; n>0;i++){
            int digit=n%10;
            countdigits++;
            n=n/10;
        }
        System.out.println("total digits in no="+countdigits);
    }
}


//ques 14 program to check a no is palindrome or not
import java.util.*;
public class loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        int original=n;
        int newno=0;
        for(int i=0; n>0; i++){
            int lastdigit=n%10;
            newno=newno*10+lastdigit;
            n=n/10;
        }
        System.out.println(newno);
        if(newno==original){
            System.out.println("no is palindrome");
        }
        else{
            System.out.println("no is not palindrome");
        }
    }
}


//ques 15  program to print no from n to 1
import java.util.*;
public class Loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i +" ");
        }
    }
}



//ques 16  program to check if no is perfect or not
import java.util.*;
public class Loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        int divisorsum=0;
        for(int i=1; i<n;i++){
          if (n%i==0){
            divisorsum= divisorsum+i;
          }
        }
        System.out.println("divisorsum="+divisorsum);
        if(divisorsum==n){
          System.out.println("it is a perfect no");
        }
        else{
             System.out.println("it is not a perfect no");
        }   
    }
}



// ques 17 program to display all prime nbr between 1 to 100

// incomplete





//ques 18  program to count odd and even digits in a noumber
import java.util.*;
public class Loopquestion { 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        int countodd=0;
        int counteven=0;
        for(int i=0; n>0; i++){
            int lastdigit=n%10;
            if(lastdigit % 2==0){
                counteven++;
            }
            else{
                countodd++;
            }
            n=n/10;
        }
        System.out.println("even digits="+counteven);
        System.out.println("odd digits="+countodd);
    }
}


//ques 19  program to print fibonacci series up to n terms
import java.util.*;
public class Loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter the no=");
        int n=sc.nextInt();
        int a=0; int b=1;
        System.out.print(a +" " +b +" ");
        for(int i=3;i<=n; i++){
            int c = a + b;
            System.out.print(c +" ");
            a=b;
            b=c;  
            }
    }
}



//ques 20  program to print gcd of two numbers
import java.util.*;
public class Loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter first no=");
        int a=sc.nextInt();
        System.out.print("enter second no=");
        int b=sc.nextInt();
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++){
          if(a%i==0 && b%i==0){
            gcd=i;
          }
        }
        System.out.println("gcd= " +gcd); 
    }
}



//ques 21 program to print lcm of two no
import java.util.*;
public class Loopquestion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter first no=");
        int a=sc.nextInt();
        System.out.print("enter second no=");
        int b=sc.nextInt();
        int  gcd=1;
        for(int i=1; i<=a && i<=b; i++){
          if(a%i==0 && b%i==0){
            gcd=i;
          }
        }
        int lcm=(a*b)/gcd;
        System.out.println("lcm=" +lcm); 
    }
}


// ques 22 program to check armstrong no


        



