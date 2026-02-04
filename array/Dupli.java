import java.util.*;
public class Dupli{
    public static void duplicate(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.print(a[j] +" ");
                    break;   
                } 
                   
            }
            
            
        }
    }
    public static void main(String args[]){
        int[] a={3,2,3,1,1,2,1,2,2};
        duplicate(a);
    }
}