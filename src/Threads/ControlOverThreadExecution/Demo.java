package Threads.ControlOverThreadExecution;


class myThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" Thread1 is running..... " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            }
        }
    }

    public class Demo {
        public static void main(String[] args) {
            myThread t1 = new myThread();
            t1.start();
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(" main Thread is running.... " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {}
                try {
                    t1.join();
                }catch(Exception e){}
                for (int j=1; j<=10; j++){
                    System.out.println("Main thread is  running "+j);
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }

            }

        }

