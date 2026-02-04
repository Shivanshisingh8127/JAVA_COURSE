public class practice {
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