package Threads.Synchronization;
class counter{
    static int count=0;
    synchronized static void increment(){
        count++;
    }
}
class Mythraed extends Thread{
    public void run(){
        for (int i=0; i<1000; i++){
            counter.increment();
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Mythraed t1=new Mythraed();
        Mythraed t2=new Mythraed();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){}

        System.out.println("Final Count: " + counter.count);
    }
}
