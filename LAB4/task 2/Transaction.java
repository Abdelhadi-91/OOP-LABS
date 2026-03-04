public class Transaction {
    
    String type;
    double amount;
    double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public String toLine() {
        return String.format("Type: %s, Amount: %.2f, Balance: %.2f",type,amount,balanceAfter);
    }
}
