package factorymethod;

public class LocalTerminalCreator extends TerminalCreator{
    @Override
    public PaymentProcessor createProcessor() {
        return new LocalCardProcessor();
    }
}
