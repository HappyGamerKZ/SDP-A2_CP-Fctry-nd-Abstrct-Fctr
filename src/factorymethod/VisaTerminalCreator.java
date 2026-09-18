package factorymethod;

public class VisaTerminalCreator extends TerminalCreator{
    @Override
    public PaymentProcessor createProcessor() {
        return new VisaProcessor();
    }
}
