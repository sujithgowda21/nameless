package conditionalstatements;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employer salary");
        long salary=sc.nextInt();
        if (salary<=300000)
        {
            System.out.println("No tax Deducted");
        }
        else if (salary>300000 && salary<=700000)
        {
            double salaryded=0.10*salary;
            double netsalary=salary-salaryded;
            System.out.println("salary deducted: "+ salaryded);
            System.out.println("net salary: "+ netsalary);
        }
        else if (salary>700000)
        {
            double salaryded=0.20*salary;
            double netsalary=salary-salaryded;
            System.out.println("salary deducted: "+ salaryded);
            System.out.println("net salary: "+ netsalary);
        }
        else{
            System.out.println("Go find a job");
        }
    }
}
