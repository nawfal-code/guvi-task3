package guvi.task03;
//Create class Employee and implements Taxable
public class Employee implements Taxable  {
    String empId;
    String name;
    double salary;
//calculate income tax for yearly salary
    @Override
    public void calcTax() {
        double tax = (salary * incomeTax) / 100;
        //display the income tax
        System.out.println("The yearly income tax of "+name+" is "+tax +" rupees");
    }
}
