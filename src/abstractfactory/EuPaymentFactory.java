package abstractfactory;

public class EuPaymentFactory implements PaymentRegionalFactory{
    public Card createCard(){
        return new EuCard();
    }
    public Receipt createReceipt(){
        return new EuReceipt();
    }
    public Validator createValidator(){
        return new EuValidator();
    }
}
