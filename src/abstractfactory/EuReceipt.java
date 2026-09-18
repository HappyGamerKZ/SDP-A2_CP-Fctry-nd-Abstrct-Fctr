package abstractfactory;

public class EuReceipt implements Receipt{
    @Override
    public void printReceipt(double amount) {
        System.out.println("[EU RECEIPT] Total: €" + amount + " (VAT 20% included)");
    }
}
