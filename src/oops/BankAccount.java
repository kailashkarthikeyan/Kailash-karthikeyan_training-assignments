package oops;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose account type (1 - SavingsAccount, 2 - SalaryAccount): ");
        int accountType = scanner.nextInt();

        if (accountType == 1) {
            // Input for SavingsAccount
            System.out.print("Enter Account Number: ");
            int accNo = scanner.nextInt();

            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter Interest Rate (as decimal, e.g., 0.05 for 5%): ");
            double interestRate = scanner.nextDouble();

            SavingsAccount savingsAccount = new SavingsAccount(accNo, balance, interestRate);

            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            savingsAccount.deposit(depositAmount);

            savingsAccount.addInterest();

            System.out.println("Final Savings Account Balance: " + savingsAccount.getBalance());

        } else if (accountType == 2) {
            // Input for SalaryAccount
            System.out.print("Enter Account Number: ");
            int accNo = scanner.nextInt();

            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter Monthly Salary: ");
            double monthlySalary = scanner.nextDouble();

            SalaryAccount salaryAccount = new SalaryAccount(accNo, balance, monthlySalary);

            salaryAccount.creditSalary();

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            salaryAccount.withdraw(withdrawAmount);

            System.out.println("Final Salary Account Balance: " + salaryAccount.getBalance());

        } else {
            System.out.println("Invalid account type selection.");
        }

        scanner.close();
    }

    private int accountNo;
    private double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

class SalaryAccount extends BankAccount {
    private double monthlySalary;

    public SalaryAccount(int accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        deposit(monthlySalary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
