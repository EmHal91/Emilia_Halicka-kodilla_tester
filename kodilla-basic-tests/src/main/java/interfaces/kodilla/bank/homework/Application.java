package interfaces.kodilla.bank.homework;

public class Application {

    public static void main(String[] args) {

        CashMachine c1 = new CashMachine();

        c1.addTransaction(100);
        c1.addTransaction(-50);
        c1.addTransaction(50);

        CashMachine c2 = new CashMachine();

        c2.addTransaction(300);
        c2.addTransaction(-200);

        CashMachine c3 = new CashMachine();

        c3.addTransaction(200);
        c3.addTransaction(-100);

        Bank bank = new Bank();
        bank.addCashMachine(c1);
        bank.addCashMachine(c2);
        bank.addCashMachine(c3);

        System.out.println(bank.getSaldo());
        System.out.println(bank.getMinusTransactions());
        System.out.println(bank.getPlusTransactions());
        System.out.println(bank.getPlusAvgTransactions());
        System.out.println(bank.getMinusAvgTransactions());
    }

}
