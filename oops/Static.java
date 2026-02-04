// Static keyword= static keyword in java is used to share the same variable or method of a given class
// properties, functions, blocks, nested classes can be created by static
public class Static{
    public static void main(String args[]){
        Student s1= new Student();
        Student.schoolname="mdbl";
        Student s2 =new Student();
        System.out.println(s2.schoolname);
        Student s3 =new Student();
        s3.schoolname="kvs";
        System.out.println(s3.schoolname);


    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}


