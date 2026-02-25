/* prototype of join method
1. public final void join() throws InterruptedException
public final Synchronized void join(long ms) throws InterruptedException
public final Synchronized void join(long ms, int nano) throws InterruptedException
definition-The join() method in Java is used to make one thread wait until another thread completes its execution.
Key Points of join() Method (Bullet Points)--
Belongs to java.lang.Thread class.
Used for thread coordination.
Causes the calling thread to wait, not the thread on which it is called.
Ensures sequential execution of threads when required.
Throws InterruptedException (must be handled or declared).
Does not stop or kill a thread.
Internally uses the wait() mechanism.
Helps when one thread depends on the result of another.
Commonly used to make the main thread wait for child threads.
📌 Overloaded Versions
join() → Waits until the thread dies.
join(long millis) → Waits for specified milliseconds.
join(long millis, int nanos) → Waits with millisecond + nanosecond precision.


// first code
public class Join extends Thread{
    public void run(){
          try{
        for(int i=0;i<=5;i++){
            Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName() +"-" +i);
        }
        } 
        catch(Exception e){
            e.printStackTrace();
        }   
    }
     public static void main(String args[]) throws InterruptedException{ 

             Join s=new Join();
             s.start();
            s.join();  // means main thread is waiting for the completion of the  s thread  and then it will join
             try{
             for(int i=0;i<=5;i++){  
                Thread.sleep(1000);
             System.out.println("main method=" +i);           
           }
        }
           catch(Exception e){
            e.printStackTrace();
        }
     }
}

// second code
public class Join extends Thread{
    static Thread mainthread;
    public void run(){
          try{
            mainthread.join();   // means s thread is waiting for the completion of the main thread  and then it will join
        for(int i=0;i<=5;i++){
            Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName() +"-" +i);
        }
        } 
        catch(Exception e){
            e.printStackTrace();
        }   
    }
     public static void main(String args[]) throws InterruptedException{ 
             mainthread=Thread.currentThread();
             Join s=new Join();
             s.start();
            
             try{
             for(int i=0;i<=5;i++){  
                Thread.sleep(1000);
             System.out.println("main method=" +i);           
           }
        }
           catch(Exception e){
            e.printStackTrace();
        }
     }
}*/



// third program
class Join extends Thread {
    public static void main(String args[]) throws InterruptedException{
        Medical  m=new Medical();
        m.start();
        m.join();  // main thread is waiting for the task completion of m thread
        TestDrive  t=new TestDrive();
        t.start();
        t.join();   // main thread is waiting for the task completion of t thread
        OfficerSign s=new OfficerSign();
        s.start();
    }
}

class Medical extends Thread{
    public void run(){
        try{
            System.out.println("medical starts");
            Thread.sleep(2000);
            System.out.println("medical end");
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}

class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("testdrive starts");
            Thread.sleep(5000);
            System.out.println("testdrive end");
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
class OfficerSign extends Thread{
    public void run(){
        try{
            System.out.println("oficer takes the file");
            Thread.sleep(3000);
            System.out.println("completed the signing process");
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}


/*
Complete Comparison Table (Basic → Advanced)
#	Parameter	           yield(),	      sleep(),	      join()
1	Method Type	             Static	        Static	Non-static
2	Belongs To	             Thread class	Thread class	Thread class
3	Called On	            Current thread,	Current thread,	Specific thread object
4	Primary Purpose	-Hint scheduler to switch thread,	Pause execution for fixed time,	Wait for another thread to finish
5	Affects Which Thread?	Current thread,	Current thread,	Calling thread
6	Based on Time?	            ❌ No,	✅ Yes,	Optional (timeout available)
7	Guaranteed Pause?	         ❌ No (only suggestion),	✅ Yes,	✅ Yes
8	Scheduler Involvement	    High (decision-based),	Medium,	Medium
9	Predictability	               Low,	              Medium,	  High
10	Thread State From	Running	Running	Running
11	Thread State To	Runnable	Timed Waiting	Waiting / Timed Waiting
12	Enters Waiting State?	❌ No	❌ No	✅ Yes
13	Enters Timed Waiting?	❌ No	✅ Yes	✅ (if timeout used)
14	Returns To	Runnable → Running	Runnable → Running	Runnable → Running
15	Releases Monitor Lock?	❌ No	❌ No	❌ No
16	Used for Synchronization?	❌ No	❌ No	✅ Yes
17	Thread Coordination?	❌ No	❌ No	✅ Yes
18	Dependency on Another Thread?	❌ No	❌ No	✅ Yes
19	Throws Checked Exception?	❌ No	✅ InterruptedException	✅ InterruptedException
20	Can Be Interrupted?	Not applicable	✅ Yes	✅ Yes
21	Requires try-catch?	❌ No	✅ Yes	✅ Yes
22	Uses Timer Mechanism?	❌ No	✅ Yes	Optional
23	Blocks Execution Completely?	❌ No	Temporarily	Yes (until thread finishes or timeout)
24	May Resume Immediately?	✅ Yes	❌ No	❌ No
25	Used for Delay?	❌ No	✅ Yes	❌ No
26	Used for Result Waiting?	❌ No	❌ No	✅ Yes
27	Used for Thread Ordering?	❌ No	❌ No	✅ Yes
28	Risk of CPU Wastage?	Possible	No	No
29	Common in Real Applications?	Rare	Very common	Very common
30	Level of Control	Very Low	Moderate	High
31	Internal Nature	Scheduling hint	Timed suspension	Dependency blocking
32	Real-life Meaning	“Anyone else go first.”	“Wake me after X time.”	“I’ll wait until you finish.”



