package factorymethod;

public class VisaProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        IO.println("Processing payment of $" + amount + "via Visa global network");
    }
}
