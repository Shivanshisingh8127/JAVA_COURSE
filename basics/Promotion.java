/*
when there are so much variable of different datatype then java automatically promote some datatype into another
 java automatically promote byte,short,char datatype into int when evaluating only in  an expression not as a variable

 */

import java.util.*;
public class Promotion {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        byte a=23;
        short s=5;
        char c='r';
        int I= a+s+c;
        float d=I;
        System.out.println(d);


    }
}

*/
//  if one operand is float, long,double then whole expression is promoted to the largest datatype among them
import java.util.*;
public class Promotion {
 public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
     float a=sc.nextFloat();
     double d=sc.nextDouble();
     long l=sc.nextLong();
     double sum =a+d-l;
     System.out.print(sum);
 }
}
  


  