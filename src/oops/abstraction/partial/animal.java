package oops.abstraction.partial;

abstract class animal {
    abstract void eat();
    void run(){
        System.out.println("running");
    }

    }

class Lion extends animal{
    void eat(){
        System.out.println("Meat");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("grass");
    }
}
class driver{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.eat();
        l.run();
    }
}