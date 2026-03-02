package conditionalstatements;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sub1 marks: ");
        sub1= sc.nextInt();
        System.out.println("enter sub2 marks: ");
        sub2= sc.nextInt();
        System.out.println("enter sub3 marks: ");
        sub3= sc.nextInt();
        System.out.println("enter sub4 marks: ");
        sub4= sc.nextInt();
        System.out.println("enter sub5 marks: ");
        sub5= sc.nextInt();
        long sum=sub1+sub2+sub3+sub4+sub5;
        double result=(sum/500.0)*100;
        System.out.println("the percentage is "+ result+"%");
        if (result>75){
            System.out.println("Grade 'A' ");}
        else if (result>50){
            System.out.println("Grade 'B' ");}
        else if (result>35){
            System.out.println("Grade 'c' ");}
        else{
            System.out.println("GOD BLESS YOU");


        }



    }
}
