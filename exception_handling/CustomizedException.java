/* these are the classes
object-throwable- 1. exception - a. CompiletimeException b. RunTimeException
                  2. error 


// if we are making our customized exception class of checked then we have to use try
catch method or throws keyword otherwise it will not compile
*/


// Customized exception class of checked exception
import java.util.*;
class voting{
    public static void main(String args[]){
        int age=12; // if we dont use try catch or throws then it will throw an error while compiling
        try{
        if(age<18){
            throw new UnderAgeException();
        }
        }
        catch(UnderAgeException e){
            e.printStackTrace();
        }    
    }
}
class UnderAgeException extends Exception{
    UnderAgeException(){
        super("you are under age");
// super is used to pass the description to the default handler exception
    }
    UnderAgeException(String msg){
        super(msg); // if we want to take a description from the user
    }
}