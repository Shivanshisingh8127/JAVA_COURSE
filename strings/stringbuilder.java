// string builder =in this we can do modifications
import java.util.*;
public class Stringbuilder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder(" ");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch+" ");   // append is used to add anything in stringbuilder
        }
        System.out.print(sb + ",");
         System.out.print(sb.length());
    }
}

// sb.toString    to convert anydata type into string

/*
difference among string, string buffer and string builder
1.storage in strings heap -area and scp
storage in stringbuffer- heap area
storage in stringbuilder heap area

2. object string-immuatble
object stringbuilder-muatble
object stringbuffer-muatble

3.memory- string- very vast 
memory- stringbuffer- very less
memory- stringbuilder- very less

4. thread not safe -stringbuilder because of non synchronized method
thread not safe -string because of non synchronized method
thread  safe -stringbuffer because of  synchronized method

*/






