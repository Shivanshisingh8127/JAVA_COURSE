/* whenever there is exception , the method in which exception occurs will create an object that object will store 3 things (exception name,description,stack trace)
then this object passes to JVM if JVM not handling the exception it passes  the object to defaukt exception handler and it prints the exception
If we handle the exception manually 
we can handle exception using 5 keywords(try,catch,finally,throw,throws)

//  exception handling using try catch 
syntax- 
try{
// risky code     // the code in which exception can be occured
  }
  catch(ExceptionClassName ref.var.name){
  // handling code
  }
*/

class Test{
    public static void main(String args[]){
        try{
     int a=100, b=0;  // risky code
     int c=a/b;
     System.out.println(c);
        }
        catch(ArithmeticException e){ // here we can write actual exception or if we don't know it we simply write exception
            System.out.println(e);
        }
        System.out.println("here program is executed");
    }
}




// if exception found
class Test{
    public static void main(String args[]){
        System.out.println("1");
        try{
         System.out.println("2");
     int a=100, b=0;  // risky code
     System.out.println("3");
     int c=a/b;   // if it found any exception in a line then from this line it will not excute further try block codeand directly jump into catch block
     System.out.println("4");
     System.out.println(c);
     System.out.println("5");
        }
        catch(ArithmeticException e){ // here we can write actual exception or if we don't know it we simply write exception
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");
        }
        System.out.println("here program is executed");
    }
}



// if exception not found
class Test{
    public static void main(String args[]){
        System.out.println("1");
        try{
         System.out.println("2");
     int a=100, b=2;  // risky code
     System.out.println("3");
     int c=a/b;   // if it found any exception in a line then from this line it will not excute further try block codeand directly jump into catch block
     System.out.println("4");
     System.out.println(c);
     System.out.println("5"); // if exception not found it will not execute catch block 
        }
        catch(ArithmeticException e){ // here we can write actual exception or if we don't know it we simply write exception
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");
        }
        System.out.println("here program is executed");
    }
}


/* methods to print exception information 
e.printStackTrace();= print everything(exception name, description,stack trace)
System.out.println(e);- print everything except stack trace
System.out.println(e.toString()); - print everything except stack trace
System.out.println(e.getMessage());-print only description 
*/


class Test{
    public static void main(String args[]){
        try{      
     int a=100, b=0;  // risky code 
     int c=a/b;   // if it found any exception in a line then from this line it will not excute further try block codeand directly jump into catch block 
     System.out.println(c);
        }
        catch(ArithmeticException e){ // here we can write actual exception or if we don't know it we simply write exception        
           // System.out.println(e);  
         //  e.printStackTrace();   
         // System.out.println(e.toString()); 
          System.out.println(e.getMessage());   
        }
        System.out.println("here program is executed");
    }
}
