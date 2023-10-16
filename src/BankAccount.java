class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws MoneySoBig {
        if (sum > amount) {
            throw new MoneySoBig("Сумма для снятия больше, чем остаток на счете", amount);
        } else {
            amount -= sum;
        }
    }
}