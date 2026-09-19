package abstractfactory;

public class UsaValidator implements Validator{
    @Override
    public boolean validate(double amount) {
        IO.print("Validating transaction via US banking security standard...\n");
        return amount > 0 && amount < 10000;
    }
}
