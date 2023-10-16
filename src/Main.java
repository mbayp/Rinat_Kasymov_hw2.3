public class Main {
    public static void main(String[] args) throws MoneySoBig {

        BankAccount account = new BankAccount(15000);


        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток на счете: " + account.getAmount() + " сом.");
            } catch (MoneySoBig e) {

                double remainingAmount = e.getRemainingAmount();
                account.withDraw(remainingAmount);
                System.out.println("Снято " + remainingAmount + " сом. Остаток на счете: 0 сом.");
                System.out.println("Операция завершена.");
                break;
            }
        }
    }
}