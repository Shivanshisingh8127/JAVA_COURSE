public class Copyconstructor{
    public static void main(String args[]){
       Student s1=new Student();
       s1.name="vamika";
       s1.roll=234;
       s1.pass="asdfg";
       s1.marks[0]=50;
       s1.marks[1]=150;
       s1.marks[2]=60;
       Student s2=new Student(s1); // copy
       s2.pass="xyz";
       s1.marks[2]=100;
       for(int i=0; i<3;i++){
        System.out.print(s2.marks[i] +" ");
       }
       System.out.print(s2.name +" " +s2.roll +" " +s2.pass);
    }
}
class Student{
    String name;
    int roll;
    String pass;
    int marks[];
    Student() {                
        marks = new int[3];
    }
    //  copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }  
}