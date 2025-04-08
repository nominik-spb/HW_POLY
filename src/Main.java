import taxes.Debit;
import taxes.DebitMinusCredit;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("Компания №1", new Debit());

        company.shiftMoney(152_000);
        company.shiftMoney(38_520);
        company.shiftMoney(-129_352);
        company.shiftMoney(88_000);
        company.shiftMoney(-59_600);
        company.payTaxes();

        company.setTaxSystem(new DebitMinusCredit());
        company.shiftMoney(152_000);
        company.shiftMoney(38_520);
        company.shiftMoney(-129_352);
        company.shiftMoney(88_000);
        company.shiftMoney(-59_600);
        company.payTaxes();

    }

}
