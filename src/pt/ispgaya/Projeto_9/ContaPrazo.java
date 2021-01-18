package pt.ispgaya.Projeto_9;

/**
 *
 */
public class ContaPrazo extends ContaBancaria {
    private double tax = 0.1;
    private double days = 365;

    /**
     *
     */
    public ContaPrazo() {
    }

    /**
     * @param name
     * @param balance
     * @param tax
     * @param days
     */
    public ContaPrazo(String name, double balance, double tax, double days) {
        super(name, balance);
        this.tax = tax;
        this.days = days;
    }

    /**
     *
     */
    public void saldoFinal() {
        System.out.println(this.getBalance() - (this.getBalance() * this.tax));
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "ContaPrazo{" +
                "name=" + this.getName() +
                ", number=" + this.getNumber() +
                ", balance=" + this.getBalance() +
                ", tax=" + tax +
                ", days=" + days +
                '}';
    }
}
