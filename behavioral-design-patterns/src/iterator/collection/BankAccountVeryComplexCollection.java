package iterator.collection;

import iterator.BankAccount;
import iterator.iterator.BankAccountIterator;
import iterator.CurrencyEnum;

public interface BankAccountVeryComplexCollection {

    void addAccount(BankAccount account);

    void removeAccount(BankAccount account);

    BankAccountIterator iterator(CurrencyEnum type);

}