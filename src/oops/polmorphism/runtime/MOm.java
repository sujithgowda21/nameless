package oops.polmorphism.runtime;

class MOm {
    void cook(){
        System.out.println(" Indian ");
    }
}
class Daughter extends MOm{
    void cook(){
        System.out.println("Chineese");
    }
}class driver{
    public static void main(String[] args) {
        MOm m=new MOm();
        Daughter d=new Daughter();

        m.cook();
        d.cook();
    }
}