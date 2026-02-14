/*
EXCEPTION= an exception is an unwanted or unexpected event that occurs at the time of excution of the program and at run time it disrupts the normal flow of the program
Exception handling= if we make any way to escape from disrupting the normal flow of the program that is called exception handling
*/

class Test{
    public static void main (String args[]){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println(100/0);  // an exception
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}

/*   Exception classes
Object class is a parent class of all the classes in java
Throwable class is the parent class of exception class
throwable= 1. Exception-a.occurs because of our program) b. recoverable 
c. types of exception-i) Compile time exception(checked) ii) Run time exception(unchecked)
2. Error- a. occurs bacause of lack of system resources not by our programs thus programmer can't do anything)
b. unrecoverable c. errors are only one type- run time exception


Compile time exception-the exceptions that can be checked by the compilker 
Run time exception- the exceptions that can't be checked by the compiler
*/

//compile time
import java.io.FileInputStream;
class Test{
    public static void main(String args[]){
     //   FileInputStream fis=new FileInputStream("d:/abc.txt");  // checked exception
     int a=100, b=0;  // unchecked exception
     int c=a/b;
     System.out.println(c);
    }
}

