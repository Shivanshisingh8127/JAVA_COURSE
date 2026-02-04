// Get=  to return  the value
//Set=   to modify the value
// this= this keyword is used to refer the current object

public class Gettersetters{        
       public static void main(String args[]){
        Pen p1= new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
       }
}
class Pen{
    String color="black";
    int tip=6;
// getter
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
//  function
//setters
    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip= newtip;
    }
}