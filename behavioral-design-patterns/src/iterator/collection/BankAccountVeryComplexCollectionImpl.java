package iterator.collection;

import iterator.BankAccount;
import iterator.iterator.BankAccountIterator;
import iterator.iterator.BankAccountIteratorGoldImpl;
import iterator.CurrencyEnum;

import java.util.List;

public class BankAccountVeryComplexCollectionImpl implements BankAccountVeryComplexCollection {

    private final List<BankAccount> accounts;

    public BankAccountVeryComplexCollectionImpl(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public void removeAccount(BankAccount account) {
        this.accounts.remove(account);
    }

    @Override
    public BankAccountIterator iterator(CurrencyEnum type) {
        return new BankAccountIteratorGoldImpl(type, this.accounts);
    }

}