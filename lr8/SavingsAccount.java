public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String number, double balance, String owner, double rate) {
        super(number, balance, owner);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * rate / 100;
        System.out.println("Начислены проценты: " + interest);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Пополнено на " + amount);
    }
}