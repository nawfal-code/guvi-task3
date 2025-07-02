package guvi.task03;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Employee Information:");
        System.out.println("---------------------");
        System.out.println("Enter the employee Id:");
        e.empId=sc.nextLine();
        System.out.println("Enter the employee name:");
        e.name=sc.nextLine();
        System.out.println("Enter the employee yearly salary:");
        e.salary=sc.nextDouble();
        e.calcTax();
        Product p=new Product();
        System.out.println("Product Information");
        System.out.println("-------------------");
        sc.nextLine();
        System.out.println("Enter the product id:");
        p.pid=sc.nextLine();
        System.out.println("Enter the product price:");
        p.price=sc.nextDouble();
        System.out.println("Enter the product quantity:");
        p.quantity=sc.nextFloat();
        p.calcTax();


    }
}
