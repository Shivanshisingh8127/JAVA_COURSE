import java.util.*;
public class Merge{
    public static void main(String args[]){
        int[] a={1,2,3,5};
        int[] b={6,7,8,3,89,67};
        int a_len=a.length;
        int b_len=b.length;
        int c_len=a_len+b_len;
        int[] c=new int[c_len];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int no:c){
            System.out.print(no +" ");
        }
    }
}