// OBJECTS= entities in the real world like animal ,pen,watch,chair etc...
// CLASS= class is a group of the objects or these entites which have same property(class is nothing but blue print of the objects)
public class oops{        // class name start with capital 
       public static void main(String args[]){
        Pen p1= new Pen();
        p1.color="black";
        System.out.println(p1.color);
        p1.tip=6;
        System.out.println(p1.tip);
        System.out.println(p1.length());
       }
}
class Pen{
    String color;
    int tip;
//  function
    int length(){
        int length= 4;
        return length ;
    }
}


