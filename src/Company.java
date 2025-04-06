public class Company {

    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    // конструктор класса
    public Company (String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney (int amount) {
        if amount > 0 {
            debit += amount;
        } else if amount < 0 {
            credit += Math.abs(amount);
        }
    }
}
