/*  protott]ype
class thread{
1. public static native void sleep(long mili) throws InterruptedException
2. public static  void sleep(long mili,int nano) throws InterruptedException 
}

Purpose-
Temporarily pauses the execution of the currently running thread.
Used to create delays or control timing in multithreaded programs.
Affects Current Thread Only-
sleep() always affects the currently executing thread, not other threads.
 Used For-
Creating delays,Simulations,Retry mechanisms, Polling systems, Animation timing
*/


public class Sleep extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{
            Thread.sleep(1000);// by this line it taking 1000 milisec to print every
             System.out.println(i);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
     public static void main(String args[]){ 
             System.out.println("main thread");
             Sleep s=new Sleep();
             s.start();
     }
}


//
public class Sleep extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{
            Thread.sleep(1000);// by this line it taking 1000 milisec to print every
             System.out.println(i+" " +Thread.currentThread().getName());
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
     public static void main(String args[]){ 
             System.out.println("main thread");
             Sleep s1=new Sleep();
             s1.start();
             Sleep s2=new Sleep();
             s2.start();
     }
}
