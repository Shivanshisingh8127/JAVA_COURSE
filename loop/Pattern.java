//  nested loop means loop inside loop

//ques 1  To print star in 5 lines
import java.util.*;
public class Pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         for (int line=1; line<=5; line++){ // outer loop
            for(int star=1; star<=line; star++){  // inner loop
                System.out.print("*" +" ");
            }
             System.out.println();
         }
        System.out.println("end the loop");  
    }
}


//  ques 2   square pattern
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<6; i++){
            for(int j=1; j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//ques 3    inverted star pattern in 5 lines
import java.util.*;
public class Pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=5;
         for (int line=1; line<=5; line++){
            for(int star=1; star<=5-line+1; star++){
             System.out.print("*");
            }
            System.out.println();
         }
    }
}



//ques 4   half pyramid pattern
import java.util.*;
public class Pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         for (int line=1; line<=4; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
             System.out.println();
         }
    }
}



//  ques 5     print characters pattern
import java.util.*;
public class Pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         char ch='A';
         for (int line=1; line<=4; line++){
            for(int chars=1; chars<=line; chars++){             
                System.out.print(ch);
                ch++;
            }
             System.out.println();
         }
    }
}


//  ques 6 print a hollow rectangle
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<5;i++){    // outer loop
            for(int j=1; j<6;j++){  // inner loop
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//  ques 7 inverted pattern
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=5; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 // ques 8 
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<5;i++){
            for(int j=1; j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
       }  
    }
}      

// ques 9
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<=5;i++){
            for(int num=1;num<=5-i+1;num++){
               System.out.print(num);
            }
            System.out.println();
        }
    }
}

//  ques 10
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=1;
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}

// ques 11
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                   System.out.print(0); 
                }
            }
            System.out.println();
        }
    }
}

// ques 12    program of printing a butterfly
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4;
        // upper half
        for(int i=1; i<=n;i++){
            // 1st part
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            int space=2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=n; i>=1;i--){
            // 1st part
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            int space=2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ques 13  Program to print the solid rhombus
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
          System.out.println();
        }
    }
}

// ques 14 Program to print the  full pyramid
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=1; j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}

// ques 15
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
         for(int i=1; i<=n; i++){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // 1st half number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // 2nd half number
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }
    }
}

// ques 16 program to print a diamond pattern
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
         for(int i=1; i<=n; i++){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
         }
         for(int i=n; i>=1; i--){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
         }
         
    }
}


//  deepak sir ki class ke question 
//  butterfly ka first part
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=4;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out .print("*");
            }
            System.out.println();
        }
    }
}


// butterfly ka second part
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        for(int i=1;i<5;i++){
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=3;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}
*/
//

import java.util.*;
public class Pattern{
    public static void main(String args[]){
        for(int i=1;i<6;i++){
            for(int j=1;j<i;j++){
                
                  System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}