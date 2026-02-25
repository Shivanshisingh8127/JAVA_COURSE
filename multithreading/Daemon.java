/*  Definition
A daemon thread is a background thread that runs to support main (user) threads.
It automatically stops when all user threads finish.
it is low priority thread but we  can change its priority
🔹 Use of Daemon Thread
Daemon threads are used for:
Garbage collection (memory cleanup),Background logging,Auto-save features,Monitoring tasks
They are used for tasks that should run in the background and stop when the program ends.
1. setDaemon(boolean on)
Used to make a thread daemon.
true → makes thread daemon
false → makes thread user thread
2. isDaemon()
 Checks whether a thread is daemon or not.
*/


public class Daemon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){  // if thread is daemon or not
            System.out.println("daemon thread"); 
        } 
       else{
            System.out.println("normal thread");
        }    
    }
    public static void main(String args[]){  // we can't create main method daemon because jvm already started main thread
        System.out.println("main thread");// jb tk main method kuch kam nhi krega daemon background me nhi chlega
        Daemon d=new Daemon();  // create daemon thread before the starting thread if we create it after start thread it will throw run time exception
        d.setDaemon(true);
        d.start();
    }
}