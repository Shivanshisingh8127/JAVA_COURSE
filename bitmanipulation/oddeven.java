//  if lsb is 1 then no is odd ;  if lsb is 0 then no is even
import java.util.*;
public class oddeven{
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("the no is even= " +n);
        }
        else{
            System.out.println("the no is odd= " +n);
        }
        
    }
    public static void main(String args[]){      
    oddoreven(3);
    oddoreven(6);
    }
}