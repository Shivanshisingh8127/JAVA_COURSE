// program to find common element between two different arrays

import java.util.*;
public class Common2d{
    public static void commonElement(int[] a, int[] b){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    temp++;
                    System.out.print( +a[i] +" " );
                    break;
                }
            }
        }
        if(temp==0){
            System.out.println("no common element found");
        }
    }
    public static void main(String args[]){
        int[] a={4,3,7,9,2};
        int[] b={5,1,4,8,3};
        commonElement(a,b);
    }
}


// Program to find common elements in two arrays using hashset 
import java.util.HashSet;
public class Common2d{
    public static void commonElement(int[] a, int[] b){
        int temp=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    temp++;
                    hs.add(a[i]);
                    break;
                }
            }
        }
        if(temp==0){
            System.out.println("no common element found");
        }
        for(int no:hs){
            System.out.print(no +",");
        }
    }
    public static void main(String args[]){
        int[] a={4,3,7,9,2};
        int[] b={5,1,4,8,3};
        commonElement(a,b);
    }
}


//  program to find common using hashset
import java.util.HashSet;
public class Common2d{
    public static void main(String args[]){
        int[] a={4,3,7,9,2};
        int[] b={5,1,4,8,3,5};
        HashSet<Integer> hs=new HashSet<>();
        for(int no:a){
            hs.add(no);
        }
        for(int no:b){
            boolean t=hs.add(no);
            if(t==false){
                System.out.print(no+" ");
            }
        }
    }
}



import java.util.HashSet;
public class Common2d{
    public static void main(String args[]){
        int[] a={4,3,7,9,2};
        int[] b={5,1,4,8,3,5};
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int no:a){
            hs1.add(no);
        }
        for(int no:b){
            hs2.add(no);
        }
        for(int no:hs2){
            boolean t=hs1.add(no);
             if(t==false){
                System.out.print(no+" ");
            }
        }

    }
}

