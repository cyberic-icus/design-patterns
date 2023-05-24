package iterator;

import iterator.collection.BankAccountVeryComplexCollection;
import iterator.collection.BankAccountVeryComplexCollectionImpl;
import iterator.iterator.BankAccountIterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        BankAccountVeryComplexCollection accounts = populateAccounts();
        BankAccountIterator goldIterator = accounts.iterator(CurrencyEnum.GLD);
        while (goldIterator.hasNext()) {
            BankAccount c = goldIterator.next();
            System.out.println(c.toString());
        }
        BankAccountIterator dollarIterator = accounts.iterator(CurrencyEnum.USD);
        while (dollarIterator.hasNext()) {
            BankAccount c = dollarIterator.next();
            System.out.println(c.toString());
        }
    }

    private static BankAccountVeryComplexCollection populateAccounts() {
        BankAccountVeryComplexCollection accounts = new BankAccountVeryComplexCollectionImpl(new ArrayList<>());
        accounts.addAccount(new BankAccount(98.5, CurrencyEnum.USD));
        accounts.addAccount(new BankAccount(99.5, CurrencyEnum.GLD));
        accounts.addAccount(new BankAccount(100.5, CurrencyEnum.EURO));

        BankAccountVeryComplexCollection accounts2 = new BankAccountVeryComplexCollectionImpl(new LinkedList<>());
        accounts2.addAccount(new BankAccount(98.5, CurrencyEnum.USD));
        accounts2.addAccount(new BankAccount(99.5, CurrencyEnum.GLD));
        accounts2.addAccount(new BankAccount(100.5, CurrencyEnum.EURO));

        return accounts; //accounts2
    }

}