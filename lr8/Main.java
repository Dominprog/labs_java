public static void main(String[] args) {
    Account[] accounts = new Account[5];

    accounts[0] = new SavingsAccount("S001", 1000, "Иван", 5);
    accounts[1] = new SavingsAccount("S002", 2000, "Пётр", 3);
    accounts[2] = new SavingsAccount("S003", 1500, "Анна", 4);

    accounts[3] = new CheckingAccount("C001", 500, "Олег", 200);
    accounts[4] = new CheckingAccount("C002", 800, "Мария", 300);

    for (int i = 0; i < accounts.length; i++) {
        accounts[i].displayInfo();
        accounts[i].calculateInterest();
        System.out.println();
    }

    SavingsAccount s = new SavingsAccount("S004", 3000, "Дмитрий", 6);
    s.deposit(500);

    CheckingAccount c = new CheckingAccount("C003", 1000, "Елена", 400);
    c.withdraw(600);
}
