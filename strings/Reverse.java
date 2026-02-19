public class Reverse{
    public static void main(String args[]){
        String s="madam";
        StringBuilder sb=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            
        }
        System.out.print(sb);
        
        System.out.println();
        if(s.equals(sb.toString())){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}