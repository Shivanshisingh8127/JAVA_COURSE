//  precedence means  larger operator will be evaluated first.
//   associativity means same size precdence operator will be evaluated left to right form.

public class Precedence {
    public static void main(String args[]){
        int a = 23*34+56-22;
//   first evaluate  multiply then add then substract  (+, - precedence same so left to right execution)
        
        System.out.print(a);
    }
}


/*    resulting data type after operation
     RESULT = B+S= INT,  S+I= INT, L+F= FLOAT, I+F= FLOAT, C+I=INT, C+S= INT, L+D= DOUBLE, F+D= DOUBLE
      WHERE B=BYTE, I=INT, F=FLOAT, S= SHORT, L=LONG, D= DOUBLE, C=character
*/

public class Precedence {
    public static void main(String args[]){
        int y =7;
        int x= ++y;
        int z= x*8;
        System.out.println(x);
        System.out.print(z);
    }
}
    