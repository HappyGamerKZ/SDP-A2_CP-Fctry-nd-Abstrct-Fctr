package factorymethod;

public class CryptoTerminalCreator extends TerminalCreator{
    @Override
    public PaymentProcessor createProcessor() {
        return new CryptoProcessor();
    }
}
