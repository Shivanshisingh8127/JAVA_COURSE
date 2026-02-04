/*
 type conversion means small size datatyoe converion to big size datatype it happens when
 1. type compatible
 2. destination type> source type 
 destination type= in which we have to store vale
 source type= which value is stored
 byte> short>int>float>long>double      this way type conversion happens
 */
import java.util.*;
public class Conversion {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a=34;
        float f=a;
        //int a= sc.nextFloat();   //error because we cant assign float into integer 
        float num =sc.nextInt();  // destination then source type
        System.out.print(num); 
     }
}

