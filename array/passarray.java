//   passing array  as arguement    // pass by value means any changes done inside function does not reflect on main function. 
//  pass by reference means any changes done inside function reflect in the main function.

          import java.util.*;
          public class passarray{
            public static void update(int marks[]){                  // update function
                for(int i=0; i<marks.length; i++){
                    marks[i]=marks[i]+1;
                }
            }
            public static void main(String args[]){
                int marks[] = {67,56,34};
                update(marks);
                //      print our marks
                for(int i=0; i<marks.length; i++){
                    System.out.println(marks[i]);
                }

            }
          }
          