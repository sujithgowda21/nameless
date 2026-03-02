package oops.inheritence;

public class multilevel {
    void eat(){
        System.out.println("Eating");
    }
}
class Lion extends Animal{  // child class
    void bark(){
        System.out.println("roaring");
    }
}
    class puppy extends Lion{
        void cry(){
            System.out.println("crying");
        }
    }


class driver{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();

        Lion d=new Lion();
        d.bark();
        d.eat();

        puppy c=new puppy();
        c.eat();
        c.bark();
        c.cry();


    }
}
