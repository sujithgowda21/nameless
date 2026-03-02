

package conditionalstatements;

import java.util.Scanner;

public class bigsmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a =sc.nextInt();
        if (a > 10) {
            System.out.println("bigger number");
        }else{
            System.out.println("smaller number");
        }
    }
}
