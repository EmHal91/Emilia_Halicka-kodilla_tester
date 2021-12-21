package interfaces.kodilla.school;

import interfaces.kodilla.bank.homework.Bank;
import interfaces.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldGetMinusTransaction() {
        Bank bank = new Bank();

        CashMachine cashMachine = new CashMachine();
        bank.addCashMachine(cashMachine);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(-40);

        int numberOfMinusTransaction = bank.getMinusTransactions();

        assertEquals(2, numberOfMinusTransaction);

    }

    @Test
    public void shouldGetPlusTransaction() {
        Bank bank = new Bank();

        CashMachine cashMachine = new CashMachine();
        bank.addCashMachine(cashMachine);
        cashMachine.addTransaction(30);

        int numberOfPlusTransaction = bank.getPlusTransactions();

        assertEquals(1, numberOfPlusTransaction);
    }

    @Test
    public void shouldGetSaldo() {
        Bank bank = new Bank();

        CashMachine cashMachine = new CashMachine();
        bank.addCashMachine(cashMachine);

        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(10);

        int addSaldoOfCashMachine = bank.getSaldo();

        assertEquals(0, addSaldoOfCashMachine);
    }

    @Test
    public void schouldGetPlusAvgTransaction() {
        Bank bank = new Bank();

        CashMachine cashMachine = new CashMachine();
        bank.addCashMachine(cashMachine);

        cashMachine.addTransaction(10);
        cashMachine.addTransaction(150);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(30);

        double numberOfPlusAvgOfCashMachine = bank.getPlusAvgTransactions();

        assertEquals(60, numberOfPlusAvgOfCashMachine);

    }

    @Test
    public void schouldGetMinusAvgTransaction() {
        Bank bank = new Bank();

        CashMachine cashMachine = new CashMachine();
        bank.addCashMachine(cashMachine);

        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-150);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-500);

        double getMinusAvgOfCashMachine = bank.getMinusAvgTransactions();

        assertEquals(-200, getMinusAvgOfCashMachine);

    }
}
