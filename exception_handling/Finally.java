/*
finally syntax-
try{  // risky code  // file open // read or write
}
catch{  // handling code
}
finally{  // cleanup code // close file
}
// we can use multiple catch blocks with one try block but we can only use single finally block with one try block not multiple.
// the statements present in the finally block execute if the try block contains control transfer statements(i.e. jump statements) like return, break or continue
//  the possibilities that disturbs the execution of finally block are-  
1. using of the System.exit() method 
2. causing a fatal error that causes the process to abort
3. due to an exception arising in the finally block
4. the death of a thread
*/

class Test{
    public static void main(String args[]){
        try{      
     int a=100, b=2;  // risky code 
     int c=a/b;   // if it found any exception in a line then from this line it will not excute further try block codeand directly jump into catch block 
     System.out.println(c);
        }
        catch(ArithmeticException e){ // here we can write actual exception or if we don't know it we simply write exception          
           e.printStackTrace();   
        }
        finally{
            System.out.println("im in finally block");
        }
        System.out.println("here program is executed");
    }
}


/*
Difference among final, finally, finalize

Feature	       final	            finally   	         finalize()
Type	      Keyword	             Block	             Method
Used          Variables,methods,    Exception            Garbage collection
              classes	            handling              	
Purpose	      Restrict modification ||	Always execute important code||Cleanup before object destruction
When Executes	At compile time rules||After try / catch block	||Before object is removed by GC
Inheritance	Prevents overriding / extending||Not related	||Can be overridden
Mandatory	No	||Optional but recommended	      ||   Not guaranteed to run
Reliability	100% reliable	||100% runs (except JVM crash)||	Unpredictable / deprecated usage
