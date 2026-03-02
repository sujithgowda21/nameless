package oops.inheritence;

public class Animal {    // parentclasst
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends Animal{  // child class
void bark(){
    System.out.println("barking");
}
}
class Driver{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();

        dog d=new dog();
        d.bark();
        d.eat();


    }
}