// Super keyword= it is used to refer immediate parent class object
// properties 1. to access parent's properties 2. to access parent's functions 3. to access parent's constructor
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
        super();       // it is inbuilt if we dont write it
        System.out.println("horse is called");
    }
}