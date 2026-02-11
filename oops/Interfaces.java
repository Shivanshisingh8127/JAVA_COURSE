/* Interface= it is a blueprint of a class(interfaces are similar to abstract class but  having all the methods of abstract type)
  Properties= 1. All methods are public, abstract & without implementation 2. Used to achieve total abstraction 3. supports multiple inheritance
 4. Variables in the interface are final, public and static
 8th version= default and static concrete methods can be created
 9th version = private concrete methods can be created


*/

public class Interfaces{
    public static void main (String args[]){
        Queen q=new Queen();
        q.moves();
        q.display();
        King k=new King();
        k.moves();
        Rook r=new Rook();
        r.moves();
    }
}

interface Chessplayer{
    void moves();   //  by default compiler makes this method public and abstract
}
interface I2{
    void display();
}
class Queen implements Chessplayer , I2{
    public void moves(){   // method over riding ho rhi isliye child class ka modifier bda hone chahiye parent class se
        System.out.println("up, down, left, right, diagonal in all 4 directions");
    }
    public void display(){
        System.out.println("display");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal by 1 step");
    }
}



