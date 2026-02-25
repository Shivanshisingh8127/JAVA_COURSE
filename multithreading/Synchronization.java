/*
class MovieBookApp extends Thread{
   static BookTicket b;  // creating the reference of the class
    int booked_seats;
    public void run(){
        b.bookTicket(booked_seats);
    }
    public static void main(String args[]){
        b=new BookTicket();

        MovieBookApp deepak=new MovieBookApp();
        deepak.booked_seats=7;
        deepak.start();
         MovieBookApp shyam=new MovieBookApp();
        shyam.booked_seats=9;
        shyam.start();
    }
}
class BookTicket{
    int total_seats=10;
    synchronized void bookTicket(int booked_seats){
        if(booked_seats<=total_seats){
            System.out.println("successfully booked");
            int remaining=total_seats-booked_seats;
            System.out.println("remaining seats= " +remaining);
        }
        else{
              System.out.println("sorry, not booked");
              System.out.println("total seats=" +total_seats);
        }
    }  
}

/*
Definition
1.Mechanism to control access of multiple processes/threads to shared resources
2.Prevents simultaneous access to critical section
3.Ensures data consistency and correct execution order
✅ Advantages
Prevents race conditions,Maintains data consistency,Protects shared resources,Ensures proper coordination between processes,Improves system reliability
❌ Disadvantages
Increases program complexity-,Causes performance overhead,Can lead to deadlock,May cause starvation,Reduces parallel execution if overused
⚠ Problems Without Synchronization-Race conditions occur,Data corruption,Inconsistent output,Lost updates,System instability or crash
*/


// synchronized block
class MovieBookApp extends Thread{
   static BookTicket b;  // creating the reference of the class
    int booked_seats;
    public void run(){
        b.bookTicket(booked_seats);
    }
    public static void main(String args[]){
        b=new BookTicket();

        MovieBookApp deepak=new MovieBookApp();
        deepak.booked_seats=7;
        deepak.start();
         MovieBookApp shyam=new MovieBookApp();
        shyam.booked_seats=9;
        shyam.start();
    }
}
class BookTicket{
    int total_seats=10;
     void bookTicket(int booked_seats){
        synchronized(this){

        
        if(booked_seats<=total_seats){
            System.out.println("successfully booked");
            int remaining=total_seats-booked_seats;
            System.out.println("remaining seats= " +remaining);
        }
        else{
              System.out.println("sorry, not booked");
              System.out.println("total seats=" +total_seats);
        }
        }
    }  
}