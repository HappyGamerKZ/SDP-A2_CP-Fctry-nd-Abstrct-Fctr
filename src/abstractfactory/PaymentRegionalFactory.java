package abstractfactory;

public interface PaymentRegionalFactory {
    Card createCard();
    Receipt createReceipt();
    Validator createValidator();
}
