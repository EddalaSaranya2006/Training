 
abstract class Payment
{
    abstract void pay();

}

class UPI extends Payment
{
    @Override
    void pay()
    {
        System.out.println("Payment done using UPI");
    }
}
class Card extends Payment
{
    @Override
    void pay()
    {
        System.out.println("Payment done using card");
    }
}
class Customer{
    private String name;
    private double balance;
    Customer(String name, double balance)
    {
        this.name=name;
        this.balance=balance;
    }

    public String getName()
    {
        return name;

    }

    public double getBalance()
    {
        return balance;
    }
    public void addMoney(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
    }
}
public class Easy{

    public static void main(String args[])
    {
        Customer customer = new Customer("Rahul", 1500.0);
        System.out.println("Initial Balance for " + customer.getName() + ": ₹" + customer.getBalance() + "\n");
        Payment upiPayment = new UPI();
        Payment cardPayment = new Card();  
        
         System.out.print(customer.getName() + " is checking out: ");
        upiPayment.pay();

        System.out.print(customer.getName() + " is trying another method: ");
        cardPayment.pay();

    }
    
}
