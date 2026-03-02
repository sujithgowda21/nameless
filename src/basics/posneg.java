package basics;

import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        if (n>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }
    }
}
