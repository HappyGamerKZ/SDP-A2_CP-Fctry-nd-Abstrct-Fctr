package factorymethod;

public class LocalCardProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        IO.println("Processing payment of $" + amount + "via local card network");
    }
}
