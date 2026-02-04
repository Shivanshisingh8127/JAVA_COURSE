//ques1    program to find a student pass or fail  if total 40% and each sub has 33% marks then pass

import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your physcics marks");
         int sub1= scan.nextInt();
         System.out.println("enter your chemistry marks");
         int sub2= scan.nextInt();
         System.out.println("enter your maths marks");
         int sub3= scan.nextInt();
         int add=(sub1+sub2+sub3);
         System.out.println(add);

         double percentage= ((add)*100)/500.00;
         System.out.println(percentage);
         if (percentage>=40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("pass with distinction A");

         }
         
         else{
            System.out.println("you are fail");
         }
    }
}   


// ques2  program to find out dayname      1 for monday..... so on 
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your value");
         int  day=scan.nextInt();
         if (day==1){
            System.out.println("monday");
         }
        else if (day==2){
            System.out.println("tuesday");
         }
         else if (day==3){
            System.out.println("wednesday");
         }
         else if (day==4){
            System.out.println("thursday");
         }
         else if (day==5){
            System.out.println("friday");
         }
         else if (day==6){
            System.out.println("saturday");
         }
         else if (day==7){
            System.out.println("sunday");
         }
         else{
            System.out.println("incorrect value");

         }
    }
}


// ques3   find whether entered year is leap year or not
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your year");
         int  year=scan.nextInt();
         if (year%4==0){
            System.out.println("this is a leap year");
         }
         else{
             System.out.println("this is  not a leap year");
         }
    }
}



// ques4   program to find out type of website .com=commercial, .org=organization, .in= indian website
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your website url");
         String website=scan.next();
         if(website.endsWith(".com")){
             System.out.println("commercial website");
         }
         else if (website.endsWith(".org")){
            System.out.println(" organization website");
         }
         else if (website.endsWith(".in")){
            System.out.println(" indian website");
         }
         else{
             System.out.println(" wrong information");

         }
    }
}
        

// ques5  program to  find no is even or odd
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        System.out.println("the value");
         int a=sc.nextInt();
         if(a%2==0){
             System.out.println("the value is even");
         }
         else{
             System.out.println("the value is odd");
         }
    }
}

         

// ques6  program to find the greatest value
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        System.out.println("the value a=");
        int a=sc.nextInt();
        System.out.println("the value b=");
        int b=sc.nextInt();
        System.out.println("the value c=");
        int c=sc.nextInt();
        if (a>b && a>c){
             System.out.println("the value a is greater");
        }
        else if(b>a && b>c){
             System.out.println("the value is b is greater");
        }
        else {   
            System.out.println("the greatest value is c among them");
        }
    }
}

//  ques 7 program to find no is positive , negative or zero
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    if(n>0){
        System.out.println("positive");
    } 
    else if (n==0){
       System.out.println("zero"); 
    } 
    else {
        System.out.println("negative");
    }  
    }
}

// ques 8  program to find character is consonant or vowel
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char ch='y';
        if(ch=='a' && ch=='e' && ch=='i' && ch=='o' && ch=='u'){
            System.out.println("vowel");
        }
        else{
           System.out.println("consonant");  
        }
    }
}


//  ques 9    program to print grade according to the marks
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter your physcics marks");
         int a= sc.nextInt();
         System.out.println("enter your chemistry marks");
         int b= sc.nextInt();
         System.out.println("enter your maths marks");
         int c= sc.nextInt();
         System.out.println("enter your english marks");
         int d= sc.nextInt();
         double percentage=(a+b+c+d)/4;
         System.out.println("this is your percentage="+percentage);
            if(percentage>80){
                System.out.println("passed with grade A");   
            }
            else if(percentage>60 && percentage<=80){
                System.out.println("passed with grade B");
            }
            else if (percentage>40 && percentage<=60){
                System.out.println("passed with grade C");
            }
            else if(percentage>33 && percentage <=40){
                System.out.println("passed with grade D");
            }
            else{
                    System.out.println("you are fail");
            }
          System.out.println("this is your report card\nThanks");
    }
}


// ques 10  program to check if a triangle is valid using its sides
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side");
        int a =sc.nextInt();
        System.out.println("enter second side");
        int b =sc.nextInt();
        System.out.println("enter third side");
        int c =sc.nextInt();
        if (a+b>c || b+c>a || a+c>b && a>0 && b>0 && c>0 ){
            System.out.println("it is a triangle");
        }
        else{
            System.out.println("it is  not a triangle");
        }
    }
}

//  ques 11 program to check an entered character is uppercase, lowercase,digit or special
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character");
        char ch =sc.next().charAt(0);
         if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase letter");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase letter");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
    }
    }
}


        
// ques 12  program to check if a person is eligible to vote or not
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age=");
        int age=sc.nextInt();
        if(age>=18){
          System.out.println("eligible to vote");
        }      
        else{
         System.out.println(" not eligible to vote");
        }
    }
}


