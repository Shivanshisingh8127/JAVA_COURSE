/*Definition=Thread priority is a number assigned to a thread that tells the CPU which thread should get preference for execution.
Key Points About Thread Priority
✅ Default priority is 5
✅ Range is 1 to 10
✅ Higher number = higher priority
✅ Priority is inherited from parent thread
✅ JVM scheduler decides execution (not guaranteed order)
✅ Setting very high priority does not ensure immediate execution
✅ Works based on OS thread scheduling

In Java, thread priority ranges from:
1 → Thread.MIN_PRIORITY
5 → Thread.NORM_PRIORITY (default)
10 → Thread.MAX_PRIORITY
 if priority is set except this 1-10 rance then it will throw runtime exception
Methods- 1. setPriority(int priority), 2. getPriority()
*/


public class PriorityThread extends Thread{
    public void run(){
          System.out.println(" start thread old priority=" +Thread.currentThread().getPriority()); 
        Thread.currentThread().setPriority(7);// we can set here also
          System.out.println("normal thread");
           System.out.println(" start thread priority=" +Thread.currentThread().getPriority()); // because it inherits parent thread priority
    }
    public static void main(String args[]){
        System.out.println(" main thread old priority=" +Thread.currentThread().getPriority());  // by default jvm provides 5 priority to the main thread
       Thread.currentThread().setPriority(6);
       System.out.println(" main thread new priority=" +Thread.currentThread().getPriority()); 
       Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println(" main thread new priority=" +Thread.currentThread().getPriority()); 
        PriorityThread pt=new PriorityThread();
       // pt.setPriority(8);   // we can set here also priority of the thread
        pt.start();
    }
}