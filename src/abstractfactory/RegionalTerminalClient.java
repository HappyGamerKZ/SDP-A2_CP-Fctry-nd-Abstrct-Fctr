package abstractfactory;

public class RegionalTerminalClient {
    private final Card card;
    private final Receipt receipt;
    private final Validator validator;

    // Композиция: клиент работает ТОЛЬКО с интерфейсами
    public RegionalTerminalClient(PaymentRegionalFactory factory) {
        this.card = factory.createCard();
        this.receipt = factory.createReceipt();
        this.validator = factory.createValidator();
    }

    public void processOrder(double amount) {
        System.out.println("Using card type: " + card.getCardType());
        if (validator.validate(amount)) {
            receipt.printReceipt(amount);
        } else {
            System.out.println("Transaction rejected by regional validator.");
        }
    }
}