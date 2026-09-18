import factorymethod.TerminalCreator;
import factorymethod.VisaTerminalCreator;

void main() {
    IO.println("<<< PART A: Factory Method >>>");
    TerminalCreator terminal = new VisaTerminalCreator();
    terminal.executePayment(150.0);
}