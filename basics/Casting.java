//type casting means convert large data into small data by using function
import java.util.*;
public class Casting {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
      //  float a=45.788f;
     //   int b= a;    it gives error but the below line execute
      //  int b= (int)a;   it will run
      // char ch ='t';    // character datatype can be converted into integer,float,double ..etc
       // double a = ch;
       // double d = 34.56555d;
        //int a= (int)d;
         int t=7;
        char ch=(char)t;   //not executing
        System.out.print(ch); 
    }
}