package pt.ispgaya.Projeto_8;

public class ContaBancaria {
    private String name;
    private int number;
    private double balance;

    ContaBancaria() {

    }

    ContaBancaria(String name, double balance) {
        this.number = Integer.parseInt(String.valueOf(Math.abs(name.hashCode())).substring(0,9));
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance+=amount;
    }

    public void withdraw(double amount) {
        if ( amount > this.balance ) {
            System.out.println("O seu saldo não lhe permite efetuar levantamentos.");
        } else {
            this.balance-=amount;
        }
    }

    @Override
    public String toString() {
        return "Card " + this.number + " (" + this.name + "): " + this.balance + " points";
    }
}
