/*
 OBJECTS= 1.objects is an instance of class and occupies mempory 
 2. entities in the real world like animal ,pen,watch,chair etc...
 3. objects consist of = 1. identity= name 2. attributes = color, breed 3. behaviors= run, eats
 4. methods to create objects= new keyword, new Instance()methos, clone(), deserialization, factory method
syntax to create an object=
Animal buzo= new Animal();


 CLASS= class is a group of the objects or these entites which have same property(class is not a real world entity but blue print of the objects)
 class does not occupy memory
 class syntax = access modifier class classname{
                                               }
  OOPS = object oriented programming systems
oops is a programming paradigm
6 main pillars of oops are=
class, objects& methods, inheritance, polymorphism, encapsulation, abstraction


*/




class Animal{
    public void eat(){
        System.out.println("eating sugar");
    }
    public static void main(String args[]){
        Animal buzo=new Animal();
        buzo.eat();
        buzo.run();
        Birds sp=new Birds();
        sp.fly();
    }
    public void run(){
        System.out.println("running in full speed");
    }
}
class Birds{
    public void fly(){
        System.out.println("its flying");
    }
}


//    by using reference variable we can initialize object values
class Animal{
    String color;
    int age;
    public static void main(String args[]){
        Animal buzo= new Animal();
        buzo.color="black";
        buzo.age=10;
        System.out.println(buzo.color +" " + buzo.age);

    }
}

//  by using method variable we can initialize object values
class Animal{
    String color;
    int age;
    public void intObj(String c, int a){
        color=c;
        age=a;
    }
    void display(){
         System.out.println(color +" " +age);
    }
    public static void main(String args[]){
        Animal buzo= new Animal();
        buzo.intObj("red" ,6);
        buzo.display();     

    }
}

