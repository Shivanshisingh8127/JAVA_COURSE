//   convert binary to decimal

import java.util.*;
public class binary {
    public static void bintodec(int num){
        int power=0;
        int dec=0;
        while(  num>0){
            int lastdigit=num%10;
            dec=dec + (lastdigit * (int)2^power);
            power++;
            num=num/10;
        }
        System.out.println("decimal  "+dec);
        return;
    }
    public static void main(String args[]){
       
        bintodec(101);
    }
}


// decimal to binary
import java.lang.Math;
import java.util.*;
public class binary {
    public static void dectobin( int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem* (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary  " +bin);
        return;
       
    }
     public static void main(String args[]){
        dectobin(8);
     }
}


