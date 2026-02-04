// string builder =in this we can do modifications
import java.util.*;
public class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder(" ");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);   // append is used to add anything in stringbuilder
        }
        System.out.print(" "+sb + " ");
         System.out.print(sb.length());
    }
}

// sb.toString    to convert anydata type into string