package iterator;

public class BankAccount implements Comparable {

    private final double money;
    private final CurrencyEnum currency;

    public BankAccount(double money, CurrencyEnum currency) {
        this.money = money;
        this.currency = currency;
    }

    public double getMoney() {
        return money;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "money=" + money +
                ", TYPE=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount bankAccount = (BankAccount) o;

        if (Double.compare(bankAccount.getMoney(), getMoney()) != 0) return false;
        return getCurrency() == bankAccount.getCurrency();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getMoney());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getCurrency() != null ? getCurrency().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.money - ((BankAccount) o).getMoney());
    }
}