/* these are the classes
object-throwable- 1. exception - a. CompiletimeException b. RunTimeException
                  2. error 


If we are making our customized exception class of checked then we have to use try
catch method or throws keyword otherwise it will not compile
*/


// Customized exception class of checked exception
class Vote{
    public static void main(String args[]){
        int age=12; // if we dont use try catch or throws then it will throw an error while compiling
        try{
        if(age<18){
            throw new UnderAgeException("you cant vote because of your age");
        }
        else{
            System.out.println("voted");
        }
        }
        catch(UnderAgeException e){
            e.printStackTrace();
             System.out.println("compiled and run");
        }    
    }
}
class UnderAgeException extends Exception{
    UnderAgeException(){
        super("you are underage");
// super keyword is used to pass the description to the default handler exception
    }
    UnderAgeException(String msg){
        super(msg); // if we want to take a description from the user
    }
}


// Customized exception class of unchecked exception
// no need to use try catch or throws for compiling the program successfully it compiles without try catch or throws
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