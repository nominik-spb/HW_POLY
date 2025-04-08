import taxes.TaxSystem;

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

    // метод класса учет доходов или расходов
    public void shiftMoney (int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s заплатит налоги: %d руб.\n", title, tax);
        debit = 0;
        credit = 0;
    }
}
