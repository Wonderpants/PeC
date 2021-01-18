package pt.ispgaya.Trabalho2;

/**
 * Gestão de uma frota de Veículos
 */
public class Gestor {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Criar dois objetos de cada classe usando os contrutores c/ e s/ parâmetros de cada classe
        Veiculo veiculo1 = new Veiculo();
        Automovel automovel1 = new Automovel(); // 2 lugares; 120L mala; 120KM

        Veiculo veiculo2 = new Veiculo("AA-00-AA", "Opel", "Corsa", 542);
        Automovel automovel2 = new Automovel("BB-11-BB", "Opel", "Adam", 451,5, 45);

        // Inserir valores para os atributos, usando os métodos de acesso,
        // para os objetos criados com o construtor sem parâmetros
        veiculo1.setMatricula("CC-22-CC");
        veiculo1.setMarca("Opel");
        veiculo1.setModelo("Insignia");
        veiculo1.setQuilometros(645);

        automovel1.setLugares(2);
        automovel1.setMala(30);
        automovel1.setMatricula("DD-33-DD");
        automovel1.setMarca("Opel");
        automovel1.setModelo("Astra");
        automovel1.setQuilometros(386);

        // Imprimir a marca e o modelo, recorrendo aos métodos de accesso, de um objeto da calsse Veiculo
        System.out.println("Marca do Veiculo1: " + veiculo1.getMarca());
        System.out.println("Modelo do Veiculo1: " + veiculo1.getModelo());
        System.out.println();

        // Imprimir um objeto de cada classe usando a instrução System.out.println()
        System.out.println(veiculo1);
        System.out.println(automovel1);
        System.out.println();
        System.out.println(veiculo2);
        System.out.println(automovel2);
        System.out.println();

        // Imprimir um objeto de cada classe usando o método definido para esse efeito
        veiculo1.imprimir(); System.out.println();
        automovel1.imprimir(); System.out.println();
        veiculo2.imprimir(); System.out.println();
        automovel2.imprimir(); System.out.println();
        System.out.println();

        // Comparar o total de quilómetros de dois objetos da classe Automovel
        int compare = automovel1.compareKM(automovel2);
        switch(compare) {
            case 1:
                System.out.println("O automóvel 1 tem mais KM que o automovel 2.");
                break;
            case -1:
                System.out.println("O automovel 2 tem mais KM que o automovel 1.");
                break;
            case 0:
                System.out.println("Ambos os automóveis tem os mesmos KM.");
                break;
        }
    }
}
