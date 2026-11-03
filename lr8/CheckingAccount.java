public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String number, double balance, String owner, double overdraftLimit) {
        super(number, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Проценты не начисляются");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(overdraftLimit);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Снято " + amount);
        } else {
            System.out.println("Превышен лимит овердрафта");
        }
    }
}
