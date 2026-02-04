//Subarray=  a continuous part of an array means in subarrays we cannot jump to the next element without taking the previous one
import java.util.*;
public class Shiv{
    public static void subArray(int num[]){
        int ts=0;
        for(int i=0; i<num.length;i++){
            int curr=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                for (int k=curr; k<=end; k++){
                    System.out.print(num[k] +" ");
                }
                ts++;
            System.out.println();
            }
            System.out.println();
        }
         System.out.println("total subarrays= " +ts);
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        subArray(num);
       

    }
}
//subarray= (n(n+1))/2