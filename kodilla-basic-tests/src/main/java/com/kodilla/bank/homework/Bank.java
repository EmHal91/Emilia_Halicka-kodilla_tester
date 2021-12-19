package com.kodilla.bank.homework;

public class Bank {

   private CashMachine[] atms = new CashMachine[20];
   private int size;


    public void addCashMachine(CashMachine cashMachine) {
        atms[size] = cashMachine;
        size++;
    }

    public int getSaldo() {
        int sum = 0;

        for (int n= 0; n<size; n++)
            sum+= atms[n].sumOfCredit();
        return sum;
    }

    public int getMinusTransactions() {
        int count = 0;
        for (int n= 0; n<size; n++) {
            CashMachine c= atms[n];
            for (int k=0; k<c.numberOfTransactions(); k++){
                if(c.getTransaction(k)<0)
                    count++;
            }
        }
        return count;
    }

    public int getPlusTransactions() {
        int count = 0;
        for (int n= 0; n<size; n++) {
            CashMachine c= atms[n];
            for (int k=0; k<c.numberOfTransactions(); k++){
                if(c.getTransaction(k)>0)
                    count++;
            }
        }
        return count;
    }
    public double getPlusAvgTransactions() {
        int count = 0;
        int sum =0;
        for (int n= 0; n<size; n++) {
            CashMachine c= atms[n];
            for (int k=0; k<c.numberOfTransactions(); k++){
                if(c.getTransaction(k)>0) {
                    count++;
                    sum+= c.getTransaction(k);
                }
            }
        }
        return sum/count;
    }

    public double getMinusAvgTransactions() {
        int count = 0;
        int sum =0;
        for (int n= 0; n<size; n++) {
            CashMachine c= atms[n];
            for (int k=0; k<c.numberOfTransactions(); k++){
                if(c.getTransaction(k)<0) {
                    count++;
                    sum+= c.getTransaction(k);
                }
            }
        }
        return sum/count;
    }
}




