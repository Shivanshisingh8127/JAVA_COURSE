/*
final keyword is used with variable to make them constant
final keyword is used with method if we want not to make any method override
final keyword is used with class if we want not to inheritted that class by any another class
*/

//  variable with final
public class Final{
    public static void main(String args[]){
        final int i=10;
       //  i+=20;  show error  because of final 
        System.out.println(i);
    }
}



// method with final
public class Final{
    public static void main(String args[]){
       A sd=new A();
       sd.m1(); 
    }
}
class A{
   final void m1(){ // this method can not be overridden
        System.out.println("im in class A");
    }
}
class B extends A{
    void m1(){
       System.out.println("im in class b"); 
    }
}


//  class with final
public class Final{
    public static void main(String args[]){
       A sd=new A();
       sd.m1(); 
    }
}
final class A{
    void m1(){ // this method can not be overridden
        System.out.println("im in class A");
    }
}
class B extends A{
    void m1(){
       System.out.println("im in class b"); 
    }
}
