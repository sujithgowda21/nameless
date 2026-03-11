package WrapperClasses;
// primitive--------->object conversion=Boxing
public class WrapperDemo1 {
    public static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);    //Manual Boxing
        System.out.println("primitive value "+ x);
        System.out.println(" wrapp value "+ obj);
    }
}
