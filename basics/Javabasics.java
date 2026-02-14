/* java is a high level programming language 
java is a platform bcoz it has its own runtime environment i.e. jvm 
*/

//boilerplate code
//1ST CODE  output in java
public class Javabasics{
    public static void main(String args[]) {
//output in java
        System.out.println("i am good");  // output in java print, println, \n
        System.out.println("i am brave");//line ka space   
        System.out.print("you should be good\n");
        System.out.print("the value of a is "  +a);
    }
}


// 2nd code draw a pattern 
public class Javabasics {
    public static void main(string args[]) {
        System.out.println("* * * *");
        System.out.println("* * * ");
        System.out.println("* * ");
        System.out.print("*\n");
    }
}

//input in java
import java.util.*;
public class Javabasics {
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);  // same
       String input= sc.next();  //only capture word before space
      // String name= sc.nextLine();  //capture with space
      // System.out.print(input); 
     //  System.out.print(name); 
      // int num= sc.nextInt();   for numbers
      // System.out.print(num);
     // float f3= sc.nextFloat();
      //System.out.print(f3);
      boolean b= sc.nextBoolean();
      System.out.println(b);
      long l= sc.nextLong();
      System.out.println(l);

      /*
      input in java    next, nextLine, nextFloat, nextInt, nextByte, nextDouble,
      nextLong, nextBoolean, nextShort
       */

    }
}

/* 
JDK-development tools+ jre
jdk contains tools needed to develop the java programs, and jre to run the programs.
jdk is mainly targeted for java development i.e. you can create a  java file(with the help of java packages), compile  a
java file and run a java file.

JRE- jvm + java packages classes+runtime libraries
actually jvm runs the program, and it uses the class libraries, and otjer supporting iles provided in JRE.
if you wannna run any java program , you need to have JRE installed in the system.

JVM- JVM is an abstract machine. It is a specification that provides runtime environment
in which java bytecode can be executed.
jvm performs following tasks
loads code, veriies code, executes code, provides runtime environment libraries
