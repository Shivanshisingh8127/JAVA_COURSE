//     break syntax end the loop 
import java.util.*;
public class Break {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=32;
         for(int i=2; i<32;i++){
            System.out.println(i);
            System.out.println("great");
         
            if (i==6){
                System.out.println("the loop is ending");
                break;
            }
         }

    }
}