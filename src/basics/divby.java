package basics;

import java.util.Scanner;

public class divby {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if (n%3==0 && n%7==0){
            System.out.println("number is divisible by both 3 and 7");}
        else{
            System.out.println("Get Lost");
        }


    }

    }

