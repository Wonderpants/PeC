package pt.ispgaya.Projeto_9;

/**
 *
 */
public class ContaBancaria {
    private String name;
    private int number;
    private double balance;

    /**
     *
     */
    ContaBancaria() {

    }

    /**
     * @param name
     * @param balance
     */
    ContaBancaria(String name, double balance) {
        this.number = Integer.parseInt(String.valueOf(Math.abs(name.hashCode())).substring(0,9));
        this.name = name;
        this.balance = balance;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @param amount
     */
    public void deposit(double amount) {
        this.balance+=amount;
    }

    /**
     * @param amount
     */
    public void withdraw(double amount) {
        if ( amount > this.balance ) {
            System.out.println("O seu saldo não lhe permite efetuar levantamentos.");
        } else {
            this.balance-=amount;
        }
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Card " + this.number + " (" + this.name + "): " + this.balance + " points";
    }
}
