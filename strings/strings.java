// String- 
import java.util.*;
public class Strings {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("enter 1=");
        String s=sc.next(); 
        System.out.println("enter 2=");
        String sh=sc.nextLine();
        // print only strings written before space
        System.out.println(s);      
        System.out.println(sh);
        int n = sh.length();   //length of sh
        System.out.println(n);
        String first= "shivanshi";
        String seco="singh";
        String full= first +" "+seco;
        System.out.println(full); 
        
        String S= full.toLowerCase();   // lower all characters of string
        System.out.println(S); 
        String U= full.toUpperCase();     //upper all characters
        System.out.println(U);
        String t=full.trim();   // removes all spaces
        System.out.println(t); 
        String sub= full.substring(3);   // 3 index se last tk string print kregi
        System.out.println(sub);
        String w= full.substring(2,5);   //2 index to 5 index tk print krega
        System.out.println(w);
        String r= full.replace('r','p');    //replaces old char r with new char p
        System.out.println("new string=" +r);
        String f= full.replace("Harr","tsan");
        System.out.println(f);
        System.out.println(full.startsWith(" Har"));   //if starting with given string
        System.out.println(full.endsWith("ry"));     //if ends with given string
        System.out.println(full.charAt(4));     //value at index 4
        System.out.println(full.indexOf(" H"));  //  returns given string occurrence index
        System.out.println(full.indexOf("ry", 4));    // returs string index starting from index 4
        System.out.println(full.lastIndexOf("r"));
        System.out.println(full.lastIndexOf("ry", 4));  
        System.out.println(full.equals("rtyu"));    // if equal to given string or not
        System.out.println(full.equalsIgnoreCase(" harRy"));  // ignore upper and lower cases only detect value
        //  Escape sequence characters=  \n= new line, \\=backslash, \'= single quote, \" = double quote...... etc
        System.out.println("my name is \n shivanshi singh");    //insert characters in the string*/
    }
    
    public class Strings  {
    public static void main(String args[]) {
        String a= "Shiva shi singh";
        a= a.trim();
        System.out.println(a);
        // replacement
        a= a.replace(" ", "_");
        System.out.println(a);
        String letter= "Dear <|name|>, Thanks a lot";
        letter= letter.replace("<|name|>", "Shivanshi");
        System.out.println(letter);
        //  detect doouble and triple spaces
        String p= "my name  double and trple space";
        System.out.println(p.indexOf("  "));
        System.out.println(p.indexOf("    "));
        //  escape sequence
        String w= "dear harry,\n\t\" this java course is nice.\"\n\tthanks";
        System.out.println(w);


    }
}
}