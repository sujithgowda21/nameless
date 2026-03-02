package oops.encapsulations;


public class encapsulation {
    private String name;
    private int usn;
    String college;

    encapsulation(String n, int u) {
        name = n;
        usn = u;
        college = " sapthagiri";
    }

    void printdetails() {
        System.out.println("Student Name: " + name);
        System.out.println("USN of student: " + usn);
        System.out.println(" college name is " + college);

    }

    String getName() {
        return name;
    }

    int getUsn() {
        return usn;
    }

    void setName(String n) {
        name = n;
    }

    void setUsn(int u){
    usn=u;
}
}
class Driver {
    public static void main(String[] args) {
       encapsulation s1 = new encapsulation("SUJITH", 113);
       encapsulation s2 = new encapsulation("SRUJAN", 111);
        s1.printdetails();
        s2.printdetails();
        s1.setName(" punith ");
        s1.setUsn(123);
        System.out.println(s1.getName());
        System.out.println(s1.getUsn());
        s1.printdetails();
    }
}