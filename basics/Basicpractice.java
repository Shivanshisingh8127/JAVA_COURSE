//question1 program of input 3 numbers and output average of 3 numbers
import java.util.*;
public class Basicpractice {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        float num2=sc.nextFloat();
        long num3= sc.nextLong();
        long average= (long)(num1+num2+num3)/3;
        System.out.println(average);

    }
}

// QUESTION2  

import java.util.*;
public class basicpractice {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        float pen=3.0f;
        float era=7.0f;
        float sharpner=10.0f;
        float total=(18*(pen+era+sharpner))/100;
        int i=(int)total;
        System.out.println(i);
    }
}



//   ques3  solve a equation
import java.util.*;
public class basicpractice {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        byte b=4;
        char c='a';
        short s=512;
        int i= 1000;
        float f=3.14f;
        double d=99.9954;
        double result=(f*b)+(i%c)-(d*s);
        System.out.print(result);
    }
}


//  ques4 
import java.util.*;
public class basicpractice {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a =34;
        float f=sc.nextFloat();
        System.out.println(a>=f);
    }
}

//    ques5  declare and initialize all primitive data types and print them
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
        byte a=5;
        short s=7;
        int i=45;
        float f =23.45f;
        double d =435.4242255;
        char c='t';
        long l=434454653;
        boolean b=true;
        System.out.println("the values are =" +a +"," +s +","+i +"," +f +"," +d +"," +c +"," +l +","+b);
    }
}


//  ques6   take user input of name age marks and print them together
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String name=sc.next();
       int age=sc.nextInt();
       int marks =sc.nextInt();
       System.out.println(name +","+age +","+ marks);
    }
}


//  ques7  swap no without using third variable
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
      int a=9;
      int b=5;
      a-= 4;
      b+=4;
      System.out.println("value a ="+a +"\n"+"valeue  b=" +b);
    }
}


 //   ques8 output 
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
    int x=4;
    int y=9;
    x+=y++ +  ++y;
    System.out.println(x);
    }
}

//  ques9   convert temperature from celcius to fahrenheit
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("temp in celcius");
       float temp=sc.nextFloat();
       double fahrenheit= (temp*9/5)+32;
       System.out.println("temp in fahrenheit=" +fahrenheit);
    }
}

// ques 10   take an integer and print its last digit
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       System.out.println("enter the no");
       int a= sc.nextInt();
        int lastdigit=a%10;
       System.out.print("lastdigit of the no= " +lastdigit);
    }
}

// ques 11  character input and print its ascii value
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    int ascii=ch;
    System.out.println("its ascii value=" +as);
    }
}
    

// ques 12  given seconds convert into hours minutes and seconds
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your value in seconds");
    int a= sc.nextInt();
    double hours=a/3600d;
    double minutes= a/60d;
    System.out.println("converted value in hours="+hours);
    System.out.println("converted value in minutes="+minutes);
      System.out.println("value in seconds="+a);
    }
}

//    ques 13   calculate body mass index
import java.util.*;
public class basicpractice{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter your weight");
        int w=sc.nextInt();
         System.out.println("enter your height");
          float h=sc.nextInt();
          double bmi= w/(h*h);
        System.out.println("enter your BMI =" +bmi); 
    }
}



// ques 14  program to convert distance from km to mtr
import java.util.*;
public class basicpractice {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
          //km to mtr change
         System.out.println("the value in km");
         int km=sc.nextInt();
         km*=1000;
         System.out.println("converted from km to mtr =" +km);
    }
}


// ques8 increment decrement
import java.util.*;
public class basicpractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=++a;
        System.out.println("pre increment of a=" +a,+b);
        int c=a++;
        System.out.println("post increment of a="+a,+c );
    }
}
      
       
       