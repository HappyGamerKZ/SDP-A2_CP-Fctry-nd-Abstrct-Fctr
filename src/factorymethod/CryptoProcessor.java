package factorymethod;

public class CryptoProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        IO.println("Processing payment of $" + amount + "via crypto network");
    }
}
