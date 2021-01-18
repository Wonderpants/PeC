public class TestaEquipa {
    public static void main(String[] args) {

        // Criando dois objetos de cada classe usando os construtores com e sem parâmetros;
        Equipa equipa1 = new Equipa();
        EquipaFutebol equipaFutebol1 = new EquipaFutebol();

        Equipa equipa2 = new Equipa("Porto");
        EquipaFutebol equipaFutebol2 = new EquipaFutebol("Benfica", 15, 20);

        // Alterando os atributos dos objetos criados com os contrutores sem parâmetros, usando os métodos de acesso;
        equipa1.setNomeDaEquipa("Sporting");

        equipaFutebol1.setNomeDaEquipa("Rio Ave");
        equipaFutebol1.setClassificacao(5);
        equipaFutebol1.setTotalPontos(10);

        // Imprimindo objetos usando o método criado para esse efeito;
        equipa1.imprimir();
        equipaFutebol1.imprimir();
        equipa2.imprimir();
        equipaFutebol2.imprimir();

        // Imprimindo objetos usando a instrução System.out.println( referencia_do_objeto ).
        System.out.println(equipa1);
        System.out.println(equipaFutebol1);
        System.out.println(equipa2);
        System.out.println(equipaFutebol2);

        // Verificando se duas equipas de futebol possuem o mesmo nome.
        System.out.println(equipaFutebol1.nomeEgual(equipaFutebol2));

    }
}

class Equipa {
    private String nomeDaEquipa;

    // Construtor sem parâmetros que inicializa as variáveis de instância com valores nulos.
    public Equipa() {
        this.nomeDaEquipa = "";
    }

    // Construtor com parâmetros que coloca nos atributos os valores desses parâmetros.
    public Equipa(String nomeDaEquipa) {
        this.nomeDaEquipa = nomeDaEquipa;
    }

    // Métodos de acesso para cada um dos atributos.
    public String getNomeDaEquipa() {
        return nomeDaEquipa;
    }

    public void setNomeDaEquipa(String nomeDaEquipa) {
        this.nomeDaEquipa = nomeDaEquipa;
    }

    // Método para imprimir um objecto.
    public void imprimir() {
        System.out.println(this.nomeDaEquipa);
    }

    // Sobrecarga do método ToString().
    @Override
    public String toString() {
        return "Equipa{" +
                "nomeDaEquipa='" + nomeDaEquipa + '\'' +
                '}';
    }
}

class EquipaFutebol extends Equipa {
    private double classificacao;
    private double totalPontos;

    // Construtor sem parâmetros que inicializa as variáveis de instância com valores nulos.
    public EquipaFutebol() {
        this.classificacao = 0;
        this.totalPontos = 0;
    }

    // Construtor com parâmetros que coloca nos atributos os valores desses parâmetros.
    public EquipaFutebol(String nomeDaEquipa, double classificacao, double totalPontos) {
        super(nomeDaEquipa);
        this.classificacao = classificacao;
        this.totalPontos = totalPontos;
    }

    // Métodos de acesso para cada um dos atributos.
    public double getClassificacao() {
        return classificacao;
    }

    public double getTotalPontos() {
        return totalPontos;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void setTotalPontos(double totalPontos) {
        this.totalPontos = totalPontos;
    }

    // Método para imprimir um objecto.
    public void imprimir() {
        System.out.println(this.classificacao + "; " + this.totalPontos);
    }

    // Sobrecarga do método ToString().
    @Override
    public String toString() {
        return "EquipaFutebol{" +
                "classificacao=" + classificacao +
                ", totalPontos=" + totalPontos +
                '}';
    }

    // A classe EquipaFutebol deverá ainda ter um método que retorna um valor do tipo boolean para verificar se duas equipas têm o mesmo nome.
    public boolean nomeEgual(EquipaFutebol equipaFutebol) {
        return this.getNomeDaEquipa().equals(equipaFutebol.getNomeDaEquipa());
    }

}
