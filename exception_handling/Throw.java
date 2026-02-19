/* throw- it is used to create an exception object manually i.e. normally 
method creates an exception object as exception occurs in that method but when we use throw,
programmer is responsible to create an exception object
syntax of throw keyword- throw new ExceptionClassName("description")
*/

// program using throw 
import java.util.*;
class Voting{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age :");
        int age=sc.nextInt();
        try{
        if(age<18){
            throw new YoungerAgeException("you are not eligible");
           // System.out.println("wow");   we don't need to writ anything after throw keyword otherwise it will not compile
        }
        else{
            System.out.println("vote success");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
     System.out.println("good");
    }
}
// cretaing customized exception class
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);  // it is calling parent class constructor
// super keyword is used for making description available for the default exception handler
    }
}


/*
Difference between throw and throws keywords
1. throw is used to create an exception object manually programmer is responsible to create exception object
but throws is used to declare an exception and gives information to the caller method

2. throw is used for runtime exception or unchecked exceptions but throws is 
used for compile time exceptions or checked exceptions

3. In case of throw keyword we can throw only single exception but in case of 
throws we can declare multiple exceptions i.e.
 void read() throws filenotfoundexception, nullpointexception etc.

4. throw keyword is used inside the method but throws is used with the method signature

5. throw keyword is followed by new instance i.e. object but throws
keyword is followed by class.

6. we can't write any statement after throw keyword and thus it can be used to 
break the statement but there is not such rules for throws keyword
