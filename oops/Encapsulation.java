//  Access modifiers= 1. private= only accessable within the class
// public = accessable everywhere( within class, within package across class, across package, derived class within package, derived classs across package)
// protected= accessable everywhere except derived class across the package
// default= 

/*           private   default   protected   public
class          no         yes        no       yes
Nested class   yes        yes        yes      yes
Constructor    yes        yes        yes      yes
Method         yes       yes        yes      yes
Field          yes         yes         yes      yes
 
/*ENCAPSULATION
Encasulation is defined as the wrapping up of the data and methos under a single entity.it also implements the data hiding
this single entity is a class where we wrapp up the data and methods and data hiding is done by using access modifier
Steps to achieve encapsulation
1. declare the variables of a class as private
2. provide public setter and getter methods to modify and view the variables values respectively

*/
class Employee{
    private int empid;   // this is data hiding
    public void setEmpid(int eid){ // it is used to view, modify and initialize the data
        empid=eid;
    }
    public int getEmpid(){  // to display things
        return empid;
    }

public static void main(String args[]){
    Employee e=new Employee();
    e.setEmpid(101);
    System.out.println(e.getEmpid());
  }
}




