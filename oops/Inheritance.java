// Inheritance= inheritnce is when properties and methods of the base class are passed on to a derived class
public class Inheritance{
    public static void main(String args[]){
        Fish shark=new Fish();
         shark.eat();
         shark.swim();
         shark.fins=4;
         System.out.println(shark.fins);
    }
}
//  Base class
class Animal{
    String Color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
         System.out.println("breathes"); 
    }
    Animal(){                                        // constructoe
        System.out.println("base class constructor");
    }
}
// Derived class  or subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
    Fish(){
        System.out.println("derived constructor");
    }
}

// types of inheritance
//  1. single level inh 2. multi level inh 3. hierarchial inh  4. hybrid inh