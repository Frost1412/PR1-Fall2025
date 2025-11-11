package PR1_Ver2.day7.tut6;

public class BankAccount {
    double balance;
    int transactions;
    double interestRate;
    String holderName;

    public BankAccount(String holderName,double initial, double interestRate ) {
        this.balance = initial;
        this.transactions = 1;
        this.interestRate= interestRate;
        this.holderName = holderName;
    }
    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }
    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }
    public void monthlyFee() {
        this.withdraw(10);
    }
    public void annualInterest() {
        balance += balance * interestRate/100;
    }
    public String toString() {
        String a = String.format("%.2f", Math.abs(balance));
        return holderName + ", " + (balance <0 ? "-$": "$") +a;
    }
    public void transfer(BankAccount other, double ammount) {
        double tong = ammount + 0.5;
        if (balance >= tong) {
            this.withdraw(tong);
            other.deposit(ammount);
            System.out.print("Ban da chuyen thanh cong " + ammount + "$ tu tai khoan" + holderName + " sang cho " + other.holderName);
        } else {
            System.out.print("Co tien dau ma chuyen???");
        }
    }

}
