package guvi.task03;
//create class Product and implement Taxable
public class Product implements Taxable  {
    String pid;
    double price;
    float quantity;
//calculate sales tax
    @Override
    public void calcTax() {
        double tax=(price*quantity) * (salesTax/100);
        //print by printf method to format sales tax output
        System.out.printf("The sales tax is %.2f\n",tax);
    }
}
