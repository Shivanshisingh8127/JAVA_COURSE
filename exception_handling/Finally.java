/*
finally syntax-
try{  // risky code  // file open // read or write
}
catch{  // handling code
}
finally{  // cleanup code // close file
}
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
