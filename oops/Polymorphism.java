/*  Polymorphism allows the same function or operator to behave differently depending on the object.
Types of polymorphism
1. compile time polymorphism= method overloading(static)(compiler handles)
2. run time polymorphism= method overriding(dynamic)(JVM handles)
Method overloading= multiple functions with same name in same class but with different parameters(different type parameters or different no of parameters or sequesnce of parameters)
Method overloading = multiple functions with same name in different class and same parameters(same type of parameters, same no of para, same seq of para) and should have inheritance property
 */

//  Method overloading
public class Polymorphism{
    public static void main(String args[]){
        Calculator cals=new Calculator();
        System.out.println(cals.sum(4,6));
        System.out.println(cals.sum(4.8,6.8));
        System.out.println(cals.sum(4,6,5));
        cals.sum(10,29,46,86);
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
    void sum(int...a){
        System.out.println("varargs method");
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
        System.out.println("eats anything");
    }
}
class Cow extends Animal{   // if it has not inheritance property it can not be method overriding
    void eat(){
        super.eat();  // we can call parent class method using child class object in overriding method by using super keyword
        System.out.println("eats grass");
    }

}

/* Packages is a group of similar types of classes, interfaces and sub packages
 TYpes of packages-  1. inbuilt packages  2. user defined package

1. Return type in over riding method should be same of parent or child class or return type in over riding method in child class should be sub type of parent class(same applied for exception handling)
2. Access modifier of parent and child class should be same or it should be more, but not less than parent classs for a child class  
3. Using  final, private and static keyword in methods these methods can not be overridden
4. The presence of synchronized/strictfp modifier method have no effect on the rules of overriding i.e. its possible that a synchronized/strictfp method can  override a non  synchronized/strictfp one anad vice versa
*/
