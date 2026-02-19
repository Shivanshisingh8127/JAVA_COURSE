/* String- string is a non primitive data types because it references a memory location where data is stored
in the heap memory i.e. it references to a memory where an object is actually placed. and thus the variable
of a non primitive data type is also called reference 
1. string is a non primitive data types
2. string is a class 
creating immutable object- String s=new String();
3. syntax of string class- public final class String extends Object implements CharSequence, Serializable,Comparable
4. to create there are 3 string classes- string,stringBuffer, stringBuilder
5. String s=new string("shiv"); it stores object in heap and string constant pool both
  string  s="shiv";  // only store object in string constant pool\
6. String objects present in SCP are not applicable for garbage collection because a reference
variable internally is maintained by jvm
7. why strings are immutable- 
8. why Strings are final- string class has got some special features which is not available to other java classes
and making the string class final prevents subclasses that could break these assumptions
9. difference between final and immutable-Immutable means the object’s state cannot be changed after creation, whereas final means the reference variable cannot be reassigned.
10. difference between ==operator and .euals method-== is used for reference comparison(add comp.)
it means == checks if both objects points to the same memory location or not
.equals method of string is used to check the content of object value
11. 
*/



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
        String full= first +" "+seco; // for concating strings

        System.out.println(full); 
        System.out.println(first.concat(seco));
        String S= full.toLowerCase();   // lower all characters of string
        System.out.println(S); 
        String U= full.toUpperCase();     //upper all characters
        System.out.println(U);
        System.out.println(String.join(";" , first,seco));
        String t=full.trim();   // removes all spaces except middle spaces of strings
        System.out.println(t); 
        String sub= full.substring(3);   // 3 index se last tk string print kregi
        System.out.println(sub);
        String w= full.substring(2,5);   //2 index to 5 index tk print krega
        System.out.println(w);
        String r= full.replace('r','p');    //replaces old char r with new char p
        System.out.println("new string=" +r);
        String f= full.replace("Harr","tsan");
        System.out.println(f);
        String f= full.replaceAll("Harr","tsan");// replace all 
         String f= full.replaceAll("Har(.)","tsan"); // replace har with tsan and remove all sapce
         String f= full.replaceAll("Har(.*)","tsan");// replace all srings with tsan after har
        String f= full.replaceFirst("Harr","tsan"); // replace first harr with tsan
        System.out.println(full.isEmpty()); // cehcks if string is empty or not
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