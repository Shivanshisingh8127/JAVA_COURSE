/* prototype of yield- public static native void yield();
🔹 yield() Method of Thread Class (Java)
Definition-yield() is a static method of the Thread class that causes the currently executing thread to temporarily pause and allow other threads of the same priority to execute.
Working of yield()- When a thread calls:Thread.yield();
The running thread: Moves from Running state → Runnable state,Gives other threads a chance to execute
The thread scheduler decides: Whether to run another thread Or continue running the same thread
It is just a hint to the scheduler, not a guarantee.

Key Points of yield()--
1.Static Method-Belongs to the Thread class.
Always affects the currently executing thread.
2.Moves Thread to Runnable State
Does NOT make the thread blocked.
It simply makes it eligible to run again.
3. No Guarantee
The scheduler may-Switch to another thread Or continue the same thread

4️. Does NOT Release Locks
If the thread holds a lock:
yield() does NOT release it.
Other threads still cannot access that resource.
5. Priority-Based-Usually gives chance to threads of:
Same priority  ,Higher priority
6️.Used For- Improving responsiveness,Avoiding thread starvation,,Debugging,Cooperative multitasking
*/



public class Yield extends Thread{
    public void run(){
          //Thread.yield(); //if want to stop the run method and give chance to the other method to execute 
             for(int i=0;i<=5;i++){
        for(int i=0;i<=5;i++){
             System.out.println(Thread.currentThread().getName() +"-" +i);
        }    
    }
     public static void main(String args[]){    
             Yield s=new Yield();
             s.start();
              Thread.yield();// if want to stop the main method and give chance to the other method to execute 
             for(int i=0;i<=5;i++){
               
             System.out.println("main method=" +i);
           }
     }
}