public class MultilevelInheritance{
    public static void main(String args[]){
        Dog tommy=new Dog("black" , "hawa",4);
            tommy.breathe();
            tommy.eat();
            tommy.bark();
            tommy.legs=4;
            System.out.println("dog has " +tommy.legs  +" " +"legs");
        
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
    Animal(){
        System.out.println("base class cons");
    }
}
class Mammal extends Animal{
    int legs;
    Mammal(){
         System.out.println("derive 1class cons");
    }
}
class Dog extends Mammal{
    String breed;
    Dog(String Color,String breed, int legs){
         System.out.println("derive 2 class cons " +Color +"," +breed +"," +legs);
    }
    void bark(){
        System.out.println("dog barks");
    }
}