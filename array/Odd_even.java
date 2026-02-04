// program to find odd or even no in an array

import java.util.*;
public class Odd_even{
    public static void odd(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print("odd=" +a[i]+",");
            }else{
                System.out.print("even="+a[i]+",");
            }      
        }
    }
    public static void main(String args[]){
        int[] a={2,3,5,22,56,21};
        odd(a);
    }
}


// program to find odd or even no in an array
// arraylist
import java.util.ArrayList;
public class Odd_even{
    public static void oddEven(int[] a){
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        int totalodd=0;
        int totaleven=0;
        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                al1.add(a[i]);
                totaleven++;
            }
            else{
                al2.add(a[i]);
                totalodd++;
            }
        }
        System.out.println("even no are=");
        for(int no:al1){
            sumeven+=no;
            System.out.print(no+",");
        }
        System.out.println();
        System.out.println("odd no are=");
         for(int no:al2){
            sumodd+=no;
            System.out.print(no +",");
        }
        System.out.println();
        System.out.println("even=" +totaleven +"\n" +"odd="+totalodd);
        System.out.println(sumeven);
        System.out.println(sumodd);

    }
    public static void main (String args[]){
        int[] a={8,5,10,12,3,4,1};
        oddEven(a);
    }
}