/*function means a block of code that is used to perform particular tasks whenever we call it.
function syntax==  
returnType functionName(){
body
//means here we give code to execeute that we want to print anytime.                    
return statement;
}
*/


import java.util.*;
public class Function{

    public static void helloworld(){  // this is function named helloworld now we call it anywhere in our code and it will print the output
        System.out.println("hello world");
        System.out.println("hello world");
        return;
    }
     public static void main(String args[]) {        // this is main function that execute our code in java
         Scanner sc=new Scanner(System.in);
         helloworld();    //calling helloworld function
     }
}






