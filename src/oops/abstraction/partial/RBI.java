package oops.abstraction.partial;

abstract class RBI {
     int ROI(){
         return 20;
     }


}
class HDFC extends RBI {
 int ROI(){
     return 4;
    }
}


class SBI extends RBI {
    int ROI() {
        return 6;
    }
}
class Display{
    public static void main(String[] args) {
        HDFC a=new HDFC();
        SBI b=new SBI();
        System.out.println(a.ROI());
        System.out.println(b.ROI());
    }
    }

