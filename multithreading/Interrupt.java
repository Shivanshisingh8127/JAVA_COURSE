/* 1. definition-The interrupt() method is used to signal a thread that it should stop or pause what it is doing.
2. interupt() method will only works when thread is in sleeping or waiting state sleep() or wait()
3.  if a thread is not in sleeping or waiting state then calling intrrupt() method will behave normally
4/ interrupt() method throws interruptedexception
symtax- public void interrupt();
methods in interrupt thread- interrupt(), interrupted()(checks whether the thread is intruppted or not) , isInterrupted()(checks whether the thread is intruppted or not)
sysntax- public static boolean interrupted(){};
public  boolean isInterrupted(){};




// interrupt method
public class Interrupt extends Thread{
    public void run(){
        try{
        for(int i=0;i<=5;i++){ 
             System.out.println(i);
              Thread.sleep(1000);// when it will come in this line it will directly goes to the catch block and throws an exception
            }  // and  if we don't add sleep method interrupt methd will never execute
        }
            catch(Exception e){
                e.printStackTrace();
            }
        }
     public static void main(String args[]){ 
             System.out.println("main thread");
             Interrupt s=new Interrupt();
             s.start();
             s.interrupt(); //
     }
}*/

// interrupted method program
public class Interrupt extends Thread{
    public void run(){
       System.out.println(Thread.interrupted());// once the method is interrupted and it changes the status of the interrupt method now there is no interruption true-> false
         System.out.println(Thread.currentThread().isInterrupted());
        try{
        for(int i=0;i<=5;i++){ 
             System.out.println(i);
              Thread.sleep(1000);// when it will come in this line it will directly goes to the catch block and throws an exception
            System.out.println(Thread.interrupted()); 
            }  // and  if we don't add sleep method interrupt methd will never execute
        }
            catch(Exception e){
                e.printStackTrace();
            }
        }
     public static void main(String args[]){ 
             System.out.println("main thread");
             Interrupt s=new Interrupt();
             s.start();
             s.interrupt(); //
     }
}

