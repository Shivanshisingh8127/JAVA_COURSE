public class Hierarchialinheritance{
    public static void main(String args[]){
        Bird b=new Bird();
        b.fly();
        b.eat();
        
    }
}
class Animal{
    String Color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
         System.out.println("breathes"); 
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walk with legs");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly in sky");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims in ponds");
    }
}