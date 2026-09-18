package factorymethod;

public abstract class TerminalCreator {
    public abstract PaymentProcessor createProcessor();

    public void executePayment(double amount) {
        PaymentProcessor processor = createProcessor();
        IO.println("Initialising payment terminal...");
        processor.processPayment(amount);
        IO.println("Transaction finished successfully");
    }
}
