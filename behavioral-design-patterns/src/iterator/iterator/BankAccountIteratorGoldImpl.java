package iterator.iterator;

import iterator.BankAccount;
import iterator.CurrencyEnum;

import java.util.List;

public class BankAccountIteratorGoldImpl implements BankAccountIterator {

    private final CurrencyEnum currency;
    private final List<BankAccount> bankAccounts;
    private int position;

    public BankAccountIteratorGoldImpl(CurrencyEnum currency,
                                       List<BankAccount> accounts) {
        this.currency = currency;
        this.bankAccounts = accounts;
    }

    @Override
    public boolean hasNext() {
        while (position < bankAccounts.size()) {
            BankAccount c = bankAccounts.get(position);
            if (c.getCurrency().equals(currency) || currency.equals(CurrencyEnum.GLD)) {
                return true;
            } else {
				position++;
			}
        }
        return false;
    }

    @Override
    public BankAccount next() {
        BankAccount c = bankAccounts.get(position);
        position++;
        return c;
    }

}