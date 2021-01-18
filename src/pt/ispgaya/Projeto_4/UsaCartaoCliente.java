package pt.ispgaya.Projeto_4;

public class UsaCartaoCliente {
    public static void main(String[] args) {

        CartaoCliente firstCard = new CartaoCliente();
        firstCard.setCardNumber(4872);
        firstCard.setTitular("Elsa Baird");

        CartaoCliente secondCard = new CartaoCliente(3781, "Franklin William");

        System.out.println("\n" + "-".repeat(42));
        firstCard.viewPoints();
        System.out.println();
        secondCard.viewPoints();
        System.out.println("\n" + "-".repeat(42));

        System.out.println("\nDeposit 45.5 points from " + firstCard.getCardNumber());
        firstCard.deposit(45.5);

        System.out.println("\n" + "-".repeat(42));
        firstCard.viewPoints();
        System.out.println();
        secondCard.viewPoints();
        System.out.println("\n" + "-".repeat(42));

        System.out.println("\nTransferring points from " + firstCard.getCardNumber() +" to " + secondCard.getCardNumber());
        secondCard.transfer(firstCard);

        System.out.println("\n" + "-".repeat(42));
        firstCard.viewPoints();
        System.out.println();
        secondCard.viewPoints();
        System.out.println("\n" + "-".repeat(42));

        System.out.println("\nWithdrawing 20 points from " + secondCard.getCardNumber());
        secondCard.withdraw(20);

        System.out.println("\n" + "-".repeat(42));
        firstCard.viewPoints();
        System.out.println();
        secondCard.viewPoints();
        System.out.println("\n" + "-".repeat(42));
    }
}
