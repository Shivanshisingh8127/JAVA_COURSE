//   Program to find duplicate element from an array

import java.util.*;
public class Dupli {
    public static void main(String[] args) {
        int[] a = {3,2,3,1,1,1,2,2,2};
        int n = a.length; 
        int k=0;
        System.out.println("all duplicate elements in an array");
        for (int i = 0; i < n; i++) {   // outer loop      
            // Check if element appeared before
            for ( k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    break;
                }
                
            }
            // If k is not equal to i, it means element was found before
             if (k != i) {
                continue;
            }

            // Check if element appears again later
         
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {

                    System.out.print(a[i] +" ");
                    break;
                }
            }
        }
    }
}
