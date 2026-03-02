package basics;

import java.util.Scanner;

public class vote {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the person age : ");
    int n=sc.nextInt();
    if (n>=18){
        System.out.println("the person is eligible to vote");
    }else{
        System.out.println("the person is not eligible to vote");
    }
}
}
