// Super keyword=super keyword is a reference variable that is used to refer immediate parent class object
// properties 1. to access parent's properties 2. to access parent's method 3. to access parent's constructor


// super keyword used to refer parent class constructor
public class Super{
    public static void main(String args[]){
        Horse h= new Horse();
        
    }
}
class Animal{
    Animal(){
        System.out.println("animal is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();      // it is inbuilt if we dont write it
        System.out.println("horse is called");
    }
}


//   super = keyword,   super()= used in constructor case
//  super keyword used to refer parent class object
public class Super{
    public static void main(String args[]){
        B h= new B();
        h.show(3);
    }
}
class A{
    int a=10;
}
class B extends A{
    int a=45;
    void show(int a){
        System.out.println(super.a);// 10
        //System.out.println(this.a); // 45
       // System.out.println(a);// 3

    }
}

//super keyword used to refer parent class method
public class Super{
    public static void main(String args[]){
        B h= new B();
        h.show();
    }
}
class A{
    void m1(){
        System.out.println("i m in class A");
    }
}
class B extends A{
    
    void show(){
        super.m1();
    }
}



