
 /*  ques4 logic operator to check no is between 10 to 50 and even    
    Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     if (a>10 && a<50 && a%2==0){
        System.out.println("condions are satisfied");
     }
     else {
        System.out.println("not satisfied");
     }
     */
     
    
/*   ques6  sum of first n natural no
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int sum=0;
   int i=0;
   while(i<=n){
    sum=sum+i;
    i++;
   }
   System.out.println("sum of first n natural numbers=" +sum);
   */

   /*  ques7  sum of even no 
   Scanner sc=new Scanner(System.in);
  int sum=0;
   
   for (int i=1; i<=10; i++){
    if (i%2==0){
        sum=sum+i;
    }
   }
    System.out.println(" sum of  even number between 1 to 10 =" + sum);
*/

/*    reverse a no
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int reverse=0;
for (int i=0;a>0; i++){
    int lastdigit= a%10;
    reverse=reverse*10+lastdigit;
    a=a/10;    
}
System.out.println("reversed no is= "+reverse);
    }
}
*/
/*  ques 8   no is palindrome or not
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
int original=a;
int reverse =0;
while(a>0){
    int lastdigit=a%10;
    reverse= reverse*10+lastdigit;
    a=a/10;       
}
System.out.println(reverse);

if (reverse==original){
    System.out.println("the number is palinndrome no=" + reverse);
}
else {
    System.out.println("no is  not palindrome");
}
*/

/*   ques 9  simple calculator using switch case
Scanner sc=new Scanner(System.in);
System.out.println("enter first no=");
int a=sc.nextInt();
System.out.println("enter second no=");
int b=sc.nextInt();
char operator=sc.next().charAt(0);
switch (operator){
    case '+': System.out.println(a+b);
    break;
    case '-': System.out.println(a-b);
    break;
    case '*': System.out.println(a*b);
    break;
    case '%': System.out.println(a%b);
    break;
    case '/': System.out.println(a/b);
    break;
    default :  System.out.println("end process");
    
}
*/

/*  ques 10   take user input of 5 subjects and declare his grade
Scanner sc=new Scanner(System.in);
System.out.print("these are the obtained marks of 5 subjects");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
int totalmarks=500;
double percentage=((a+b+c+d+e)/5);
System.out.println("percentage of student is=" +percentage);
if (percentage<33){
    System.out.println("F");
}
else if(percentage>33 && percentage<50){
     System.out.println("E");
}
else if(percentage>50 && percentage<65){
     System.out.println("D");
}
else if(percentage>65 && percentage<80){
     System.out.println("C");
}
else if(percentage>80 && percentage< 87){
     System.out.println("B");
}
else{
     System.out.println("A");
}
*/







// ques 16  if character is vowel or consonant
      Scanner sc=new Scanner(System.in);
      
      
      for (char ch='a'; ch<='z'; ch++){
      if (ch=='a'){
        System.out.print(" v=" +ch +" ");
      }
      else if(ch=='e'){
        System.out.print(" v=" +ch +" ");
      }
      else if(ch=='i'){
        System.out.print(" v=" +ch +" ");
      }
      else if (ch=='o'){
        System.out.print(" v=" +ch +" ");
      }
      else if(ch=='u'){
        System.out.print(" v=" +ch +" ");
      }
      else {
         System.out.print("c=" +ch +" ");
      }
      }
         
    } 
}


















