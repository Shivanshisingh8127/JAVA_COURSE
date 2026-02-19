/* Static keyword= static keyword in java is used to share the same variable or method of a given class
properties= methods, blocks, nested classes can be created by static
static keyword is used with variable(class level)(local variable= nhi ), methods, blocks, inner class(nested class)(outer class= nhi)
static is used for memory management
*/


// static variables
//  1.
public class Static{
    public static void main(String args[]){
        Student s1= new Student();
        Student.schoolname="mdbl";
        Student s2 =new Student();
        System.out.println(s2.schoolname);
        Student s3 =new Student();
        s3.schoolname="kvs";
        System.out.println(s3.schoolname);
    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}


// 2.
class Test{
    static int a =10; // instance variable
    void show(){
       // static b=11;  // can't use static in local variable
    }
}
class Demo{
    public static void main(String args[]){
        System.out.println(Test.a);  // static variables can be accessed through class 
    }
}



//  3.
public class Static{
    public static void main(String args[]){
        Employee e1= new Employee(101,"shiv");
        e1.display();
        Employee e2= new Employee(102,"shivansh");
        e2.display();

    }
}
class Employee{
    int empid;
    String name;
    static String company="smart programming"; // assigning static variables to every object
    Employee(int empid,String name){
        this.name=name;
        this.empid= empid;       
    }
    void display(){
        System.out.println(name +" "+empid +" " +company);
    }
}



// 4.
class Count{
    static int count=0;
    Count(){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();
        Count c4=new Count();
    }
}



/* Static methods
1. static methods belongs to the class not to the objects
2. static method can be accessed directly by the class name and does'nt need any object
3. static method can access only static data. it can't access non static data(instance data)
4. static method call only other static methods and can't call a non static methods
5. static method can't refer to this or super keyword in anyway


// example of 1 and 2 rule
class Test{
   static void display(){
        System.out.println("122");
    }
    public static void main(String args[]){
        Static.show(); // here we need to write the class name to call the method across the class
        display();  // for static method there is no need to make an object they can be called by class
    // we dont need to write class name to call a method within the class
    }
}
class Static{
    static void show(){
        System.out.println("Shivanshi singh");

    }
}


// example of rule 3, 4 and 5
class Static{
    static int i=10;// only static data can be accesses through static methods
    static void display(){
        System.out.println(i);
       //  System.out.println(this.i);  not possible in static methods
        show(); // only static methods can be accessed
    }
    static void show(){
        System.out.println("233");
    }
    public static void main(String args[]){
        display();    
    }   
}
*/

// Static block uses 1. for loading of native methods 2. for initializing static variable
class Static{
    static{ 
// for calling static block there is no need to write anything.It autimatically  runs not even main method but after version 1.6 jvm there is necessary  to write  main method and we can create multiple static blocks
        System.out.println("it is first static block");
    }
    public static void main(String args[]){
         System.out.println("it is a main method");
    }
    static{
        System.out.println("it is second static block");
    }
}

