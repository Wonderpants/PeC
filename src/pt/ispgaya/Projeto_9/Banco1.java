package pt.ispgaya.Projeto_9;

public class Banco1 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        ContaBancaria ordem = new ContaOrdem("Utilizador 1", 5, 100);
        System.out.println(ordem);
        ordem.withdraw(1000);

        System.out.println();
        ContaBancaria prazo = new ContaPrazo("Utilizador 2", 1, 0.1, 365);
        System.out.println(prazo);
        ((ContaOrdem) ordem).compare(prazo);

        ((ContaPrazo) prazo).saldoFinal();
    }
}
