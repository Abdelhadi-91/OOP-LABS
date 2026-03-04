public class BankAccount {
    String owner;
    double balance;
    TransactionLog log;

    public BankAccount(String owner, double initialBalance, int capacity) {
        this.owner = owner;
        this.balance = initialBalance;
        this.log = new TransactionLog(capacity);
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        Transaction t = new Transaction("deposit", amount, balance);
        log.add(t);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            return false;
        }
        balance -= amount;
        Transaction t = new Transaction("withdraw", amount, balance);
        log.add(t);
        return true;
    }

    public void printStatement() {
        for (int i = 0; i < log.count(); i++) {
            Transaction t = log.get(i);
            System.out.println(t.toLine());
        }
    }

    public double getBallence() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Abdelhadi", 500, 10);

        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(5000.00);
        account.deposit(150.50);
        account.withdraw(50.00);
        account.deposit(-100.00);
        account.withdraw(600.00);
        account.deposit(1200.00);
        account.withdraw(100.00);
        account.deposit(50.00);
        account.printStatement();
    }

}
