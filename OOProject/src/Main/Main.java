// Main.java
package Main;

import project.Admin;
import project.Manager;
import project1.FinanceManager;
import project1.DiplomaProject;
import project1.Message;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Project Testing...");

        // Creating Admin
        Admin admin = new Admin("Charlie", "adminpass");
        System.out.println("Admin Created: " + admin.getName() + ", Role: " + admin.getRole());

        // Creating Manager
        Manager manager = new Manager("Alice", 1, "alice@company.com", "password");
        System.out.println("Manager Created: " + manager.getName() + ", Role: " + manager.getRole());

        // Creating Finance Manager
        FinanceManager financeManager = new FinanceManager("Bob", "password", 10000.0);
        System.out.println("Finance Manager Created: " + financeManager.getName() + ", Budget: " + financeManager.getBudget());

        // Approving Transactions
        financeManager.approveTransaction(5000.0);
        financeManager.approveTransaction(6000.0);

        // Creating Diploma Project
        DiplomaProject project = new DiplomaProject("AI Research");
        project.addPublishedPaper(new Message("AI in Medicine"));
        project.addPublishedPaper(new Message("AI in Finance"));

        System.out.println("Diploma Project Details:");
        project.printDetails();

        System.out.println("Project Testing Completed.");
    }
}
