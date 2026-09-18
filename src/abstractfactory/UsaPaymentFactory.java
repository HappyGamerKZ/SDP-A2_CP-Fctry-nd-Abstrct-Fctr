package abstractfactory;

public class UsaPaymentFactory implements PaymentRegionalFactory{
    public Card createCard(){
        return new UsaCard();
    }
    public Receipt createReceipt(){
        return new UsaReceipt();
    }
    public Validator createValidator(){
        return new UsaValidator();
    }
}
