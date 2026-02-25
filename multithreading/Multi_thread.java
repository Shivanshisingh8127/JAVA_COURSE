/*
multitasking- performing multi taska at the single time
use- increases the performance of cpu
types- 1. process based multitasking (mp) 2. thread based multitasking(mt)
Multiprocessing- when one system is connected with multiple processors to complete the task
Multithreading- executing multiple small tasks to complete one big task is called multiple threading
multi threading is best suitable at programming level, java provides predefined  API  for multithreading

difference between process and thread
process                                               thread
1.def- a program which is in execution state         1. subpart of process
heavy weight                                          light weight
2. context switching - it takes more time              less time




2 ways to create thread
a. thread (class)  
b.  runnable(interface) inside it only one method run()
*/
  

// a. creating thread using thread class
/*
 class Multi_thread extends Thread{  // step 1 extend thread class
    public void run(){   // 2. over ride run method
        System.out.println("thread tasks");
    }
    public static void main(String args[]){
        Multi_thread t=new Multi_thread();  // 3. create an object
        t.start();   // invoke thread
    }
    
}

// b.  creating thread using runnable interface
public class Multi_thread implements Runnable{ // step-1 implementing runnable interface
    public void run(){     // 2. over ride the method
         System.out.println("thread tasks");
    }
    public static void main(String args[]){
        Multi_thread t=new Multi_thread();  // 3. create an object of current class
        Thread th= new Thread(t); // 4. creating an object of thread class and passsing the reference variable
        th.start();   // 5. invoke thread
    }  
}


// 1. performing single task from single thread
public class Multi_thread extends Thread{  // step 1 extend thread class
    public void run(){   // 2. over ride run method
        System.out.println("thread tasks");
    }
    public static void main(String args[]){
        Multi_thread t=new Multi_thread();  // 3. create an object
        t.start();   // invoke thread
    }   
}

// 2. performing multiple task from single thread
public class Multi_thread extends Thread{  // step 1 extend thread class
    public void run(){   // 2. over ride run method
        System.out.println("thread tasks");
    }
    public static void main(String args[]){
        Multi_thread t=new Multi_thread();  // 3. create an object
        t.start();   // invoke thread
        Multi_thread t2= new Multi_thread();
        t2.start();
    }   
}

// 3.performing multiple task from multiple thread
public class Multi_thread{
    public static void main(String args[]){
        thread1 t1=new thread1();
        t1.start();
        thread2 t2=new thread2();
        t2.start();
        thread3 t3=new thread3();
        t3.start();
        thread4 t4=new thread4();
        t4.start();

    }
}
class thread1 extends Thread{
    public void run(){
        System.out.println("task1");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("task2");
    }
}
class thread3 extends Thread{
   public void run(){
        System.out.println("task3");
    }
}
class thread4 extends Thread{
    public void run(){
        System.out.println("task4");
    }
}

/* thread constructors- total 8 constructor
syntax- public class Thread implements Runnable
1   Thread()
2	Thread(Runnable target)
3	Thread(Runnable target, String name)
4	Thread(String name)
5	Thread(ThreadGroup group, Runnable target)
6	Thread(ThreadGroup group, Runnable target, String name)
7	Thread(ThreadGroup group, Runnable target, String name, long stackSize)
8	Thread(ThreadGroup group, String name)


methods in thread class-
1. start()
Starts a new thread.
Internally calls the run() method.
A thread can be started only once.
🔹 2. run()
Contains the code executed by the thread.
If you call run() directly, it acts like a normal method (no new thread created).
🔹 3. sleep(long milliseconds)
Pauses the current thread for a specified time.
Throws InterruptedException.
🔹 4. join()
Makes the current thread wait until another thread finishes execution.
t.join(); // wait until thread t completes
🔹 5. yield()
Temporarily pauses the current thread to allow other threads of the same priority to execute.
Thread.yield();
🔹 6. setPriority(int priority)
Sets thread priority (1 to 10).
🔹 7. getPriority(
Returns thread priority.
int p = t.getPriority();
🔹 8. setName(String name)
Sets thread name.
t.setName("MyThread");
🔹 9. getName()
Returns thread name.
String name = t.getName();
🔹 10. isAlive(
Checks if thread is still running.
t.isAlive();
🔹 11. currentThread()
Returns reference of currently executing thread.
Static method.
Thread t = Thread.currentThread();
🔹 12. interrupt()
Interrupts a sleeping/waiting thread.
t.interrupt();
🔹 13. Deprecated Methods (Not Recommended ❌)
stop(),suspend(),resume()
These are unsafe and should not be used.
📌 Summary Table
Method	Purpose
start()	Starts thread
run()	Contains thread code
sleep()	Pause thread
join()	Wait for another thread
yield()	Pause for other threads
setPriority()	Set priority
isAlive()	Check if running
interrupt()	Interrupt thread
*/

// basic methods start, run, currentthread, isalive
public class Multi_thread extends Thread{
   public void run(){
        System.out.println("this thread is exucuted by start thread");
        System.out.println(Thread.currentThread().getName());  // thread 0 
        Thread.currentThread().setName("myThread");  // setting the name of the current method
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());  
    }
    public static void main(String args[]){
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());   // getting the name of the current name of thread  
       Multi_thread th=new Multi_thread(); // executing run method
       th.start();
       System.out.println(Thread.currentThread().isAlive());
    }
}

