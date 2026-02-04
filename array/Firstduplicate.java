//  program to find first duplicate element
// method first

import java.util.*;
public class Firstduplicate{
    public static void firstDuplicate(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.print("first duplicate element="+a[j]);
                    temp++;
                    break;
                }    
            }
            if(temp>0){
                break;
            }         
        }
        if(temp==0){
            System.out.print("not found any duplicate element");
        }
    }
    public static void main(String args[]){
        int[] a={6,5,3,2,6,1,0,4};
        firstDuplicate(a);
    }
}


// program to find first duplicate element
// using hash set method (collection)
import java.util.HashSet;
public class Firstduplicate{
    public static void hashSet(int[] a){
        int temp=-1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=a.length-1;i>=0;i--){
            if(hs.contains(a[i])){
                temp=i;
            }
            else{
                hs.add(a[i]);
            }
        }
        if(temp==-1){
            System.out.println("not found duplicate");
        }
        else{
            System.out.print("duplicate element="+a[temp]);
        }
     }
     public static void main(String args[]){
        int[] a={6,5,3,2,1,2,4};
        hashSet(a);
     }
}
