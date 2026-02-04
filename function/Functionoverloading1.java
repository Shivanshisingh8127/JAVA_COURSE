//  *** methods = there are two types of methods 
// 1.  user defined method =it means like when we define any method like factorial, sum , product etc
//  2.  inbuilt method= it means already available method in java programming  that we use according to ur need like pow, max, Math, sc.nextInt() etc



// FUNCTION OVERLOADING==   IT means multiple functions with same name but with different parameters (like if we want to change datatypes or no of parameters )
import java.util.*;
public class Functionoverloading1{
    //  function to calc sum of 2 no
    public static int sum(int a, int b){
        return a+b;
    }
    //   function to calc sum of 3 no
    public static int sum (int a, int b, int c){                     // using parameters
        return a+b+c;       //it returns the output to the main function
    }
    //   function to calc sum of 3 float no 
    public static float sum(float a, float b, float c){             //  using datatypes
      return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(3,7));
        System.out.println(sum(4,7,10));
        System.out.println(sum(4.5f,7.4f,10.2f));
    }
}

