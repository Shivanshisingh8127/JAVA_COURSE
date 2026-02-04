import java.util.*;
public class palindrome{
    public static boolean palindrome(String sr){
        for(int i=0; i<sr.length()/2;i++){
            if(sr.charAt(i)!=sr.charAt(sr.length()-1-i)){
                //  not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String sr="shivanshi";
        System.out.println(palindrome(sr));
    }
}