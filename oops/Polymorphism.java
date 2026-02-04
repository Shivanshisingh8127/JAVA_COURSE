// types of polymorphism
// 1. compile time polymorphism= method overloading
// 2. run time polymorphism= method overriding
// Function overloading= multiple functions with same name but with different parameters(different type parameters or different no of parameters)
// function overloading
public class Polymorphism{
    public static void main(String args[]){
        Calculator cals=new Calculator();
        System.out.println(cals.sum(4,6));
        System.out.println(cals.sum(4.8,6.8));
        System.out.println(cals.sum(4,6,5));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    double sum(double a, double b){
        return a +b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

// Function overriding= parent and child classes both have the same functions with a different definition.
// Function overriding
public class Polymorphism{
    public static void main(String args[]){
        Cow a=new Cow();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.print("eats anything");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("eats grass");
    }

}

// Packages is a group of similar types of classes, interfaces and sub packages
// TYpes of packages-  1. inbuilt packages  2. user defined package