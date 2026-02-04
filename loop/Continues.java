//     continue syntax skip the iteration
import java.util.*;
public class Continues {
    public static void main(String args[]){
        for (int i=2; i<10;i++){
            System.out.println(i);
            System.out.println("great");
            if (i==7){
                System.out.println("loop end");
            continue;
            }
        }
    }
}