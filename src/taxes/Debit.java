package taxes;

public class Debit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = debit * 6 / 100;
        return Math.max(0, tax);
    }
}
