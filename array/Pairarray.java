// Program to find every possible pair in an arrya

import java.util.*;
public class Pairarray{
    public static void pair( int number[]){
        int tp=0;
        for (int i=0; i<number.length; i++){
            int curr=number[i];
            for(int j=i+1;j<number.length; j++){
                System.out.print("(" +curr +"," +number[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs=" +tp);
        return;
    }
    public static void main (String args[]){
        int number[]={1,2,3,4,5};
        pair(number);
    }
}
//  total pairs=(n(n-1))/2;   where n= total elements