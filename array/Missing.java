// program to find the missing no
// Method 1= Arraysum

import java.util.*;
public class Missing{
    public static void main(String args[]){
        int[] a={1,2,3,4,6,7};
        int expectedno= a.length+1;

        int totalsum=(expectedno*(expectedno+1))/2;
        int actualsum=0;
        for(int i=0;i<a.length;i++){
            actualsum+=a[i];
        }
        System.out.println("the missing no =" +(totalsum-actualsum));
    }
}


//  program to find the missing no
// Method 2 xor
import java.util.*;
public class Missing{
    public static void main(String args[]){
        int[] a={1,2,3,4,6,7};
        int xor1=a[0];
        for(int i=1;i<a.length;i++){
            xor1=xor1^a[i];
        }
        int xor2=1;
        for(int i=2;i<=7;i++){
            xor2=xor2^i;
        }
        System.out.println("missing no=" +(xor1^xor2));
    }
}
