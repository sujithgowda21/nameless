package oops.Basics.ClassWithAttributes;

public class Student {
    String name;
    int usn;

    Student(String n, int u){
        name=n;
        usn=u;

    }
    void printdetails(){
        System.out.println("Student Name: "+name);
        System.out.println("USN of student: "+usn);

    }
}
class Driver{
    public static void main(String[] args) {
        Student s1=new Student("SUJITH",113);
        Student s2=new Student("SRUJAN",111);
        s1.printdetails();
        s2.printdetails();

    }

}
