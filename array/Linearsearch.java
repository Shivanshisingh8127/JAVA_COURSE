 // linear search=find the index of the element in a given array  

import java.util.*;
public class Linearsearch{
    public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1 ; // -1 means key doesn't exist
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int number[]={2,3,4,5,6,7,8,10};
        int key=5;//  means at what index key 5 is stored
        int index=linearSearch(number,key);
        if (index==-1){
            System.out.println("not found");
        } else{
            System.out.println("key is at index=" +index);
        }
    }
}



// linear search for string
import java.util.*;
public class Linearsearch{
    public static void linear(String[] a, String key){
        for(int i=0; i<a.length;i++){
            if(a[i]==key){
                System.out.print("key found at "+i+" " +"index");
            }else{
                System.out.println("not found");
            }
        }
     return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] a={"shiv","alok","vibhu"};
        String key="vibhu";
       linear(a,key);
        
    }
}