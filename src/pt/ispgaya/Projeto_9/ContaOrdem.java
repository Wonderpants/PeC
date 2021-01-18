package pt.ispgaya.Projeto_9;

/**
 *
 */
public class ContaOrdem extends ContaBancaria{

    private double limit = 100;

    /**
     *
     */
    public ContaOrdem() {
    }

    /**
     * @param name
     * @param balance
     * @param limit
     */
    public ContaOrdem(String name, double balance, double limit) {
        super(name, balance);
        this.limit = limit;
    }

    /**
     * @return
     */
    public double getLimit() {
        return limit;
    }

    /**
     * @param limit
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    /**
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
        if (this.getBalance() <= -this.limit) {
            System.out.println("Limite excedido");
        } else {
            super.withdraw(amount);
        }
    }

    /**
     * @param conta
     */
    public void compare(ContaBancaria conta) {
        System.out.println(this.getBalance() > conta.getBalance() ? this.getName() : conta.getName() + " has the most money");
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "ContaOrdem{" +
                "name=" + this.getName() +
                ", number=" + this.getNumber() +
                ", balance=" + this.getBalance() +
                ", limit=" + this.limit +
                '}';
    }
}
