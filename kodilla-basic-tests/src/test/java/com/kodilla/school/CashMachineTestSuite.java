package com.kodilla.school;

import com.kodilla.bank.homework.CashMachine;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldReturnCashMachineBeEmpty() {
        CashMachine cashMachine = new CashMachine();

        int sumOfCredit = cashMachine.sumOfCredit();
        assertEquals(0, sumOfCredit);
    }
    @Test
    public void shouldAddTransaction() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(20);

        assertEquals(1, cashMachine.numberOfTransactions());
    }
    @Test
    public void shouldReturnPropperCredit() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(10);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(30);

        assertEquals(60, cashMachine.sumOfCredit());

    }

    }


