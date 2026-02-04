// ques 1 program to count vowel and consonant in a string

import java.util.*;
public class stringquestion {
    public static int count(String st){
        int countvowel=0;
        int countconsonant=0;
        for(int i=0;i<st.length();i++){
           if(st.charAt(i)=='a' || st.charAt(i)== 'e' ||  st.charAt(i)=='i' ||  st.charAt(i)=='o' || st.charAt(i)=='u'){
                countvowel++;      
            } 
            else if(st.charAt(i)=='A' || st.charAt(i)== 'E' ||  st.charAt(i)=='I' ||  st.charAt(i)=='O' || st.charAt(i)=='U'){
                countvowel++;  
            } 
            else if(st.charAt(i)==' '){
                continue;
            }
            else{
                countconsonant++;
                 
            }
        }
        System.out.println("total vowel in string=" +countvowel);
        return countconsonant;
    }
    public static void main (String args[]){
        String st="i am a student studying in class 8th MY NAME";
        System.out.println("total consonant in string=" +count(st));
        System.out.println(st.length());
    }
}



// ques 2  program to convert string to uppercase and lower case
import java.util.*;
public class stringquestion {
    public static String cases(String st){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(st.charAt(0));
        sb.append(ch);
        for(int i=1; i<st.length(); i++){
            if(st.charAt(i)==' '){
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            }
            else{
                sb.append(Character.toLowerCase(st.charAt(i)));
            }    
        }
        return sb.toString();
    }
    public static void main (String args[]){
         String st="i am going to MEET YOU IN a hotel. YOU have to COME";
         System.out.println(cases(st));
    }
}


// ques 3 program to reverse a string
import java.util.*;
public class stringquestion {
    public static String reverse(String st){
        StringBuilder sb=new StringBuilder("");
        for(int i=st.length()-1; i>=0; i--){
            sb.append(st.charAt(i));
        }
        return sb.toString();
    }
    public static void main (String args[]){
         String st="hello my name is shivanshi singh.do you want to be my friend";
         System.out.println("this is the reverse string");
         System.out.println(reverse(st));
    }
}



