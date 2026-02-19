// Inheritance= inheritnce is when properties and methods of the base class are passed on to a derived class
// inheritence tells IS-A relationship
public class Inheritance{
    public static void main(String args[]){
        Fish shark=new Fish(4 , "blue");
         shark.eat();
         shark.swim();
         shark.breathe();

        
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
    Animal(){// constructor
        System.out.println("base class constructor");
    }
}
// Derived class  or subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
    Fish(int fins, String Color){
        this.fins=fins;
        this.Color=Color;
        System.out.println("derived constructor "+fins +" " +Color);
    }
}

/* types of inheritance
//  1. single level inh 2. multi level inh 3. hierarchial inh  4. hybrid inh 5. Multiple inheritance
 advantage of inh= code reusability, method overriding
 */


/*  Types of relationships between classes
1. Inheritance (IS-A)
2. Association (HAS-A)  i) Aggregation(weak bonding)  ii) Composition(strong bonding)
*/