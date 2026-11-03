public class Account {
    private String number;
    private double balance;
    private String owner;

    public Account(String number, double balance, String owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void calculateInterest() {
        System.out.println("Проценты не начисляются");
    }

    public void displayInfo() {
        System.out.println("Счёт: " + number + ", владелец: " + owner + ", баланс: " + balance);
    }
}