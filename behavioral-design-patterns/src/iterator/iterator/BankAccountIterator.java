package iterator.iterator;

import iterator.BankAccount;

public interface BankAccountIterator {

    boolean hasNext();

    BankAccount next();
}