package abstractfactory;

public class EuValidator implements Validator{
    @Override
    public boolean validate(double amount) {
        IO.print("Validating transaction via EU GDPR/PSD2 compliance...");
        return amount > 0 && amount < 5000;
    }
}
