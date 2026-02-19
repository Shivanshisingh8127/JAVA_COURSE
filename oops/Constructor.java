// Constructor is a special method which is invoked automatically at the time of object creation.
/* 1. constructor have the same name as class
2. constructor dont have return type not even void
3. constructor are only called only once, at object creation
4. memory allocations happen when constructor is called\
5. constructor is used to initialize objects 
*/
public class Constructor{
    public static void main(String args[]){
       Student s1=new Student();
       Student s2=new Student("shivanshi");
       Student s3=new Student(23);
       Student shiv= new Student("shivanshi", "123we");
    }
}
class Student{
    String name;
    int roll;
    String pass;
    Student(){        // non parameterized
       System.out.println("constuctor is called in main function");
    }
    Student(String name){  // parameterized
    this.name=name;
    System.out.println("name constructor="+name);
   }
   Student(int rollno){
    this.roll=rollno;
    System.out.println("roll constructor="+roll);
   }
   Student(String name, String pass){
      System.out.println(name +" "+ pass);
   }
}

/*   Types of constructor
 1. default constructor= compiler automatically creates constructor  with no arguements only when user we don't create any constructor
2. non-parameterized (user defined)
3. parameterized (user defined)
*/

//   Constructor overloading= when objects decides  which particular consructor is called for the object that is called construcor overloading.
//  constructor chaining= it means it will first call automatically default construcor  of parent class from which a derived class is inherited.



