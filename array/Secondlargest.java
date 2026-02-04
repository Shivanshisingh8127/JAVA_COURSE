// program to find second largest 

import java.util.*;
public class Secondlargest{
    public static void second(int[] a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                  
                }
            }
        }
    }
    public static void main(String args[]){
        int[] a={2,3,4,6,7,13,67};
        second(a);
         System.out.println("second largest=" +a[1]);
    }
}



//  program to find second smallest no
import java.util.*;
public class Secondlargest{
    public static void second(int[] a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                  
                }
            }
        }
    }
    public static void main(String args[]){
        int[] a={2,3,4,6,7,13,67};
        second(a);
         System.out.println("second smallest=" +a[1]);
    }
}


//  program to find  second largest
import java.util.*;
public class Secondlargest{
    public static void second(int[] a){
        int largest=Integer.MIN_VALUE;
        int Secondlargest=Integer.MIN_VALUE;  
        for(int i=0; i<a.length;i++){
            if(a[i]>largest){
                Secondlargest=largest;
                largest=a[i];
            }
            else if(a[i]>Secondlargest && a[i]!=largest){
                Secondlargest=a[i];
            }
        }  
        System.out.println("second largest=" +Secondlargest);
    }
    public static void main(String args[]){
        int[] a={12,2,4,7,37,85,3};
        second(a);
    }
}


// program to find second minimum
import java.util.*;
public class Secondlargest{
    public static void secMin(int[] a){
        int smallest=Integer.MAX_VALUE;
        int secondminimum=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
            secondminimum=smallest;
            smallest=a[i];
            }
            else if(a[i]<secondminimum && a[i]!=smallest){
                secondminimum=a[i];
            }
        }
        System.out.println("second minimun="+secondminimum);

    }
    public static void main(String args[]){
        int[] a={1,5,2,7,34,21,0};
        secMin(a);
    }
}