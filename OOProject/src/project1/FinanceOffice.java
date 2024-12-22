package project1;

import java.util.ArrayList;
import java.util.List;

public class FinanceOffice {
    private List<String> transactions;

    public FinanceOffice() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
        System.out.println("Transaction added: " + transaction);
    }

    public void printTransactions() {
        System.out.println("All transactions:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

