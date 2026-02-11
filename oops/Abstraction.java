/*
 Abstraction= hiding all the unnecessary details and showing only the important parts to the user
 Abstract class= 1. cant create an object of abstract class 2. can have abstract/non-abstract methods 3. can have constructors
 
*/

//  Abstract class
public class Abstraction{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();
        h.changecolor();
        System.out.println(h.color);
        
        Chicken c=new Chicken();
        c.eat();
        c.walk();
        c.changecolor();
        System.out.println(c.color);
    }
}
abstract class Animal{      // abstract class does not have any object
    String color;
    Animal(){   // constructor
        color="brown";
    }
    void eat(){   //  non abstract methods
        System.out.println("animal eats");
    }
    abstract void walk();    // abstract function does not implement anything but gives an idea
}
class Horse extends Animal{
    void changecolor(){
        this.color=" dark black";
    }
    void walk(){       // it is compulsory to create a body of abstract method in child class
        System.out.println("walks in 4 legs");
    }
}
class Chicken extends Animal{
    void changecolor(){
        this.color=" dark yellow";
    }
    void walk(){
      System.out.println("walks in 2 legs");  
    } 
}