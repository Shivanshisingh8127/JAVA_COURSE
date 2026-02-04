/*   conditional sentence      **  if else statement syntax
if(condition){
    code
}
else {
  code 
}
*/

// 1
import java.util.*;
public class Condition {
    public static void main(String args[]) {
        boolean a=true;
        boolean b=false;
        if(a||b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }
    }
}
    

//  2
import java.util.*;
public class Condition {
    public static void main(String args[]) {   
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        boolean c= a%2==0;
        if(c){
            System.out.println("even");
        }
       
       else {
            System.out.println("odd");
        }
    }
}



//   elif statement( if else ladder)    multiple condiotion using elif statement
import java.util.*;
public class Condition {
    public static void main(String args[]) {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter your income in lakh");
     int income=scan.nextInt();
     double tax=0;
     if(income<500000){
        tax=0;//if your given condition is true here it will print ans and do not excute next line (koi bhi condition di ho)
        System.out.println(tax);
     }
     else if (income>=500000 && income<1000000){  
        tax=(income)*0.2;//if  ypur upper condition is false then it will not execute the upper line
        System.out.println(tax);
     }
     
     else {
        tax=0.3*income;
        System.out.println(tax);
     }
    }
}


// ternary operator syntax   variable type =condition?statement1 : statement2;
import java.util.*;
public class Condition {
    public static void main(String args[]) {
     int a=4;
     String s=(a%2==0)?"even":"odd";
     System.out.println(s);
 
//  pass fail
import java.util.*;
public class Condition {
    public static void main(String args[]) {
    Scanner scan=new Scanner(System.in);
    int marks=scan.nextInt();
    boolean value=(marks>=33)?true:false;
    System.out.println(value);
    }
}



/*switch case statement  syntax       
switch(variable){
case 1:
syso
break;
case 2:
default:
syso
 }

 // var can be int string, int, char in java  
 */

import java.util.*;
public class Condition {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your value");
        int age= scan.nextInt();
        switch(age){
            case 18:
                System.out.println("you are adult");
                break;            
// break means it will check this line is true or not if we dont use break it will print all output
            case 24:
                System.out.println("you have job");
                break;
            case 60:
                System.out.println("you are retired");
                break;
            default:
                System.out.println("enjoy life");
        }
        System.out.println("thanks");

    }
}


