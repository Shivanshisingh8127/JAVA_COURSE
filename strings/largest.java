// str1.compareTo(str2)    0=equal; <0:-ve str1<str2;   >0: +ve  str1>str2
import java.util.*;
public class largest{
    public static String getlargest(String st[]){
        String largest=st[0];
        for(int i=1;i<st.length; i++){
            if (largest.compareTo(st[i]) < 0){
                largest=st[i];
            }
        }
        System.out.println("largest string is=" +largest);
        return largest;
    }
    public static void main(String args[]){
        String st[]={"mango", "apple","banana","vicks"};
        getlargest(st);
        
    }
}