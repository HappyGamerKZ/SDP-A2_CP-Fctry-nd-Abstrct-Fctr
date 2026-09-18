package abstractfactory;

public class UsaReceipt implements Receipt {
    @Override
    public void printReceipt(double amount) {
        System.out.println("[US RECEIPT] Paid: $" + amount + " (Tax: Included)");
    }
}
