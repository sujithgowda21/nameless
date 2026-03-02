package oops.inheritence.hirarchial;

public class home {
    void door(){
        System.out.println(" Entrance");
    }
}

class wall extends home{
    void  window(){
        System.out.println(" fresh air ");
    }
}

class kitchen extends home{
    void cook(){
        System.out.println(" chicken ");
    }
}
class Driver{
    public static void main(String[] args) {
        home a=new home();
        a.door();

        wall b=new wall();
        b.door();
        b.window();

        kitchen c=new kitchen();
        c.door();
        c.cook();
    }
}
