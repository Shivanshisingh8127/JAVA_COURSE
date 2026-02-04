// maximum sub array sum using brute force

import java.util.*;
public class Maxsubarraysum{
    public static int bruteForce(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            int curr=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                currsum=0;
                for (int k=curr; k<=end; k++){
                   currsum+= num[k];
                }
                System.out.println(currsum);  
                if(currsum>maxsum){
                    maxsum=currsum;
                }   
        }    
    }
      System.out.println("maxsubarrays= " +maxsum);
      return maxsum;
    }
    public static void main(String args[]){
        int num[]={2,4,6,-8,-10};
        bruteForce(num);
    }
}
//  subarray= (n(n+1))/2

// maximum sub array sum  using kadanes algorithm

import java.util.*;
public class Maxsubarraysum{
    public static void kadanes(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
             currsum=currsum+num[i];
            if (currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
              System.out.println(currsum);
        }
          System.out.println("maxsubarrays sum= " +maxsum);
    }
    public static void main(String args[]){
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}


// find maxsubarraysum using prefix sum

