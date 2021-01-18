package pt.ispgaya.Projeto_7;

public class GestaoCartao {

    public static void main(String[] args) {

        CartaoCliente cartaoCliente1 = new CartaoCliente("Bruno Cunha");
        CartaoCliente cartaoCliente2 = new CartaoCliente("Diogo Fernandes");

        cartaoCliente1.viewPoints();
        System.out.println();
        cartaoCliente2.viewPoints();
    }
}
