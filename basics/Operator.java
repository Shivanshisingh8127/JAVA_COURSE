//ARITHMETIC OP=  [+,-,*,/,(%=module (remainder)]binary     unary operator(++,--)
// binary operator

public class Operator {
    public static void main(String args[]){
        int a=7;
        int b=2;
        int c=a%b;            
        System.out.print("modulo=" +c);
    }
}



//  unary   pre increment=  ++a(first change then use),  post increment= a++(first use then change) like this post decrement etc..
public class Operator {
    public static void main(String args[]){
        int a=9;
        int b= ++a;    //++a= a+1 always 1 will be added
        System.out.println(a);
        System.out.print(b);
    }
}


//    relational operators [== equal, < small,  > great, != not equal to,  <=, >=]
public class Operator {
    public static void main(String args[]){
        int a=34;
        int b=23;
        System.out.print(a>=b);
    }
}


// logical operators [&& and, ! not , || or]
public class Operator {
    public static void main(String args[]){
        int a=9;
        int b=3;
        boolean c=true;
        boolean d=false;
        boolean f= a>b;
        System.out.print(f);
    }
}

// assignment operator  [=,+=, -=,  *=,  /=]
public class Operator {
    public static void main(String args[]){
        int a = 6;
        a*= 6;
        int b=45;
         b*=3;
        float f=b;
        System.out.println(a);
        System.out.print(f);
    }
}






