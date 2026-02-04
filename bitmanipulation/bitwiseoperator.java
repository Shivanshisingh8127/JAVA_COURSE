// decimal to binary
//   0=000; 1=001;2=010; 3= 011; 4=100; 5=101; 6=110; 7=111; 8=1000
/*   Binary and &
0 & 0=0;   0 & 1=0; 1 & 0=0; 1 & 1=1
*/

import java.util.*;
public class bitwiseoperator{
    public static void main(String args[]){
        System.out.println(5 & 6);
    }
}


/*  Binary OR |
1 | 1=1; 0 | 1=1; 1 | 0=1; 0 | 0=0
*/

import java.util.*;
public class bitwiseoperator{
    public static void main(String args[]){
        System.out.println(5 | 6);
    }
}

/*  Binary XOR ^
0 ^ 0=0; 0 ^ 1=1; 1 ^ 0=1; 1 ^ 1=0
*/
import java.util.*;
public class bitwiseoperator{
    public static void main(String args[]){
        System.out.println(5 ^ 6);
    }
}


/*  Binary one's complement
 ~1=0; ~0 = 1
 */
import java.util.*;
public class bitwiseoperator{
    public static void main(String args[]){
        System.out.println(~6);
    }
}
/*  MSB= Most significant bit (in left side) if msb is 1 then no is negative if it is 0 then nbr is positive
 LSB = Least significant bit(in right side)
 if we want to find real value of negative no then we use 2's complement. 
 2's complement-  step 1= find 1's complement;  step 2= add 1;
*/

/*  Binary left shift << (a<<b)= In this first we remove a's left most numbers with b spaces then we shift our no a's left most with b spaces and then fill 0 in the empty space
formula=   a<<b= a*2^b
*/

import java.util.*;
public class bitwiseoperator{
    public static void main(String args[]){
        System.out.println(5<<3);
    }
}


/*  Binary right shift >> (a>>b)= In this we remove a's right most numbers with b spaces then  we shift our no a's right most with b spaces and then fill 0 in the empty space
formula=   a>>b= a/2^b
*/

import java.util.*;
public class bitwiseoperator{
    public static void main(String args[]){
        System.out.println(5>>1);
    }
}

