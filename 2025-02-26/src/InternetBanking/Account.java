package InternetBanking;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawalLimit;

    public Account(int number, String holder, double balance, double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getWithdrawalLimit() {
        return this.withdrawalLimit;
    }

    public void deposit(double amount) throws Exception {
        if(amount < 0) {
            throw new Exception("Requested amount is negative. Depósito negativo só no Tigrinho.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > getBalance()) {
            throw new Exception("Saldo insuficiente.");
        }else if (amount > getWithdrawalLimit()) {
            throw new Exception("Você não pode exceder o limite de saque.");
        }
        this.balance -= amount;
    }

    @Override

    public String toString(){
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance
    }



}
