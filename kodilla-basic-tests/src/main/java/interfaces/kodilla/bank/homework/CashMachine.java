package interfaces.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions = new int[20];
    private int size = 0;

    public int sumOfCredit() {
        int sum = 0;

        for (int i : transactions) {
            sum += i;
        }
        return sum;
    }

    public int numberOfTransactions() {
        return size;
    }

    public void addTransaction(int value) {
        transactions[size] = value;
        size++;
    }
    public int getTransaction (int index) {
        return transactions[index];
    }

}





