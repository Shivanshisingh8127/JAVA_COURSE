
//      input using operators sum substraction 

import java.util.*;
public class Input {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
//   ques 1 program to find area of circle
        float pi= sc.nextFloat();
        int rad= sc.nextInt();
        float area= pi*rad*rad;
        System.out.print(area);

//   ques 2 program to find area of square 
       float a=sc.nextFloat();
       double area =a*a;
       System.out.println(" the area of squeare is=" +area);
    }
}

import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       // String a=sc.next(); // its only for printing the word before space
        String a= sc.nextLine();  // it will print all the things after the space also
        System.out.println("the string name=" +a);
    }
}

import java.util.*;
public class Input {
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);  // same
       String input= sc.next();  //only capture word before space
      // String name= sc.nextLine();  //capture with space
      // System.out.print(input); 
     //  System.out.print(name); 
      // int num= sc.nextInt();   for numbers
      // System.out.print(num);
     // float f3= sc.nextFloat();
      //System.out.print(f3);
      boolean b= sc.nextBoolean();
      System.out.println(b);
      long l= sc.nextLong();
      System.out.println(l);

      /*
      input in java    next, nextLine, nextFloat, nextInt, nextByte, nextDouble,
      nextLong, nextBoolean, nextShort
       */

    }
}


