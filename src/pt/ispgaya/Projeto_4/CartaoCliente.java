package pt.ispgaya.Projeto_4;

public class CartaoCliente {
    private int cardNumber;
    private String titular;
    private double points = 0;

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getPoints() {
        return this.points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public CartaoCliente() {
    }

    public CartaoCliente(int cardNumber, String titular) {
        this.cardNumber = cardNumber;
        this.titular = titular;
    }

    public void deposit(double points) {
        this.points += points;
    }

    public void withdraw(int points) {
        if(points <= this.points)
            this.points -= points;
    }

    public void transfer(CartaoCliente cardNumber) {
        this.points += cardNumber.getPoints();
        cardNumber.setPoints(0);
    }

    public void viewPoints() {
        System.out.print("Card " + this.getCardNumber() + " (" + this.getTitular() + "): " + this.points + " points");
    }
}
