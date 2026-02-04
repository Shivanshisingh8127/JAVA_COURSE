// Program to find reverse an array

import java.util.*;
public class Reversearray{
    public static void reverse(int num[]){
        int first=0, last= num.length-1;
        while(first<last){
            //  swap numbers
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
        return ;
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        reverse(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }
    }
}