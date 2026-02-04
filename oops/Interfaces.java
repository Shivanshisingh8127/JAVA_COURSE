//  Interface= it is a blueprint of a class
//  Properties= 1. All methods are public, abstract & without implementation 2. Used to achieve total abstraction 
// 3. Variables in the interface are final, public and static
public class Interfaces{
    public static void main (String args[]){
        Queen q=new Queen();
        q.moves();
        King k=new King();
        k.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal in all 4 directions");
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



