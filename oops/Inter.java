import java.util.*;
class In{
    public static void fun(int a){
         
        car c=new car();
        bike b=new bike();
        
        int i=1;
        while(1==1){
            Scanner sc=new Scanner (System.in);
            int a=sc.nextInt();
            if(a==1){
                b.start();  
            }
            else if(a==2){
               b.off();
            }
            else if(a==3){
                b.status(); 
            }
            if(a==4){
                c.start();  
            }
            else if(a==5){
               c.off();
            }
            else if(a==6){
                c.status(); 
            }
        }
}
    public static void main(String args[]){ 
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        fun(a);
    }
}

interface engine{
    boolean bt;
    void status();
    void start();
    void off();
}
class car implements engine{
    public void start(){
    bt=true;
    }
    public void off(){
         bt=false;
    }
    public void status(){
        if(bt){
            System.out.println("engine start car");
        }
        else{
            System.out.println("engine off car");
        }
    }
}
class bike implements engine{
   public void start(){
    bt=true;
    }
    public void off(){
         bt=false;
    }
    public void status(){
        if(bt){
            System.out.println("engine start bike");
        }
        else{
            System.out.println("engine off bike");
        }
    }
}
