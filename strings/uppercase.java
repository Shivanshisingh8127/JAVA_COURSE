import java.util.*;
public class uppercase{
    public static String uppercase( String sb){
        StringBuilder str=new StringBuilder("");
        char ch=Character.toUpperCase(sb.charAt(0));
        str.append(ch);
        for(int i=1;i<sb.length(); i++){
            if(sb.charAt(i)==' ' && i<sb.length()-1){
                str.append(sb.charAt(i));
                i++;
                str.append(Character.toUpperCase(sb.charAt(i)));
            } else{
                str.append(sb.charAt(i));
            }
    }
     return str.toString();
    }
    public static void main(String args[]){
        String sb="i am shivanshi singh";
        System.out.println(uppercase(sb));
    }
}
