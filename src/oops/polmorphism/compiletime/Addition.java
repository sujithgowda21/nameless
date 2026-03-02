package oops.polmorphism.compiletime;

import org.w3c.dom.ls.LSOutput;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int b, int c, int d) {
        return b + c + d;
    }
}
class driver{
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println(obj.add(4,9));
        System.out.println(obj.add(3,4,5));

    }
}