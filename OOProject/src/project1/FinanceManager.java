package project1;

import project.Employee;

public class FinanceManager extends Employee {
    private double budget;

    public FinanceManager(String name, String password, double budget) {
        super(name, password);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void approveTransaction(double amount) {
        if (amount > budget) {
            System.out.println("Transaction denied: Insufficient budget.");
        } else {
            budget -= amount;
            System.out.println("Transaction approved. Remaining budget: " + budget);
        }
    }

    @Override
    public String getRole() {
        return "Finance Manager";
    }
}