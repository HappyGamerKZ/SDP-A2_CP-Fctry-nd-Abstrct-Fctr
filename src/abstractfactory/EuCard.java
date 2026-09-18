package abstractfactory;

public class EuCard implements Card{
    @Override
    public String getCardType() {
        return "EU SEPA Card";
    }
}
