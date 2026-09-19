import abstractfactory.RegionalTerminalClient;
import abstractfactory.PaymentRegionalFactory;
import abstractfactory.UsaPaymentFactory;
import abstractfactory.EuPaymentFactory;
import factorymethod.TerminalCreator;
import factorymethod.VisaTerminalCreator;

void main() {
    IO.println("<<< PART A: Factory Method >>>");
    TerminalCreator terminal = new VisaTerminalCreator();
    terminal.executePayment(150.0);

    IO.println("\n<<< PART B: Abstract Factory >>>");
    PaymentRegionalFactory factory = new UsaPaymentFactory();
    RegionalTerminalClient client = new RegionalTerminalClient(factory);
    client.processOrder(150.0);
}