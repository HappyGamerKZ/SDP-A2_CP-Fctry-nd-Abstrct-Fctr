package abstractfactory;

public class UsaCard implements Card {
    @Override
    public String getCardType() {
        return "US Debit/Credit Card";
    }
}
