/*
public class This{
    public static void main(String args[]){
        Test t=new Test();
        t.setValue(10);
        t.show();
    }
}
class Test{
    int i;
    void setValue(int i){
        this.i=i; // this.i variable refers to the instance variable of current class
    }
    void show(){
        System.out.println(i);
    }
}
*/
/*
Uses of this keyword
1. this keyword refers to the instance variable of current class
2. this keyword is used to invoke current class method
3. this keyword is used to invoke current class constructor
4. this keyword is used to pass as an arguement in method call
5. this keyword is used to pass as  an arguement in constructor call
6. this keyword can be used to return the current class instance from the method
*/



//  invoking class method

public class This{
    public static void main(String args[]){
        Test t=new Test();
        
        t.show();
    }
}
class Test{

    void display(){
        System.out.println("hello");
    }
    void show(){
        display();  // if we dont use this keyword compiler automatically adds this keyword while invokin method
    }
}




//  for invoking constructor using this keyword

public class This{
    public static void main(String args[]){
        Test t=new Test();         
    }
}
class Test{
    Test(){
        this(20);  // used to call parameterized cons
        System.out.println("no arg constructor");
    }
    Test(int a){
       // this();  // used to call the current class constructor(non parameterized)
        System.out.println("parameterized constructor");
    }
    void display(){
        System.out.println("hello");
    }
    void show(){
        display();  // if we dont use this keyword compiler automatically adds this keyword while invokin method
    }
}




// this keyword is used to pass an arguement in method
public class This{
    public static void main(String args[]){
        Test td=new Test(); 
        td.show();        
    }
}
class Test{
    void display(Test td){
        System.out.println("hello");
    }
    void show(){
        display(this);  //this keyword is used to pass an arguement in method
    }
}



//  used as return 
public class This{
    public static void main(String args[]){
        Test td=new Test(); 
        td.display();        
    }
}
class Test{
    Test display(){
        System.out.println("hello");
        return this;
    }
}




    


