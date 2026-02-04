// Brute force method for finding duplicate element
// this method is used when only one element repeats for more than one element this method doesn't work


import java.util.*;
public class Duplicatearray{
    public static void duplicate(int[] a){
        System.out.print("duplicate elements are=");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.print(a[j]+",");
                }
            }
        }
    }
    public static void main(String args[]){
        int[] a={3,4,3,2,2,1,5,5};
        duplicate(a);
    }
}


// Set interface method for finding duplicate element
import java.util.Set;
import java.util.HashSet;
public class Duplicatearray{
    public static void setInterface(int[] a){
        System.out.print("duplicate no=");
        Set<Integer> s=new HashSet<>();
        for(int no:a){
            if(s.add(no)==false){
                System.out.print(no +",");
            }
        }
    }
    public static void main(String args[]){
        int[] a={3,4,5,3,2,2,2,1};
        setInterface(a);
    }
}



// Using hashtable finding duplicatearray    nhi aya smjh
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
public class Duplicatearray{
    public static void main(String args[]){
        int[] a={3,5,4,3,2,2,1,3};
        Map<Integer,Integer> hm=new HashMap<>();
        for(int no:a){
            Integer count=hm.get(no);
            if(count==null){
                hm.put(no,1);
            }
            else{
                count++;
                hm.put(no,count);
            }
        }
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for(Map.Entry<Integer,Integer>me:es){
            if(me.getValue()>1){
                System.out.print(me.getKey() +" ");
            }
        }
    }
}