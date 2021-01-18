package pt.ispgaya.Trabalho2;

/**
 * Classe Automovel
 */
public class Automovel extends Veiculo {

    private int lugares;
    private int mala;

    /**
     *
     * Construtor sem parâmetros que inicializa os atributos com valores nulos.
     *
     */
    public Automovel() {
        this.lugares = 0;
        this.mala = 0;
    }

    /**
     *
     * Construtor com parâmetros de classe
     *
     * @param lugares
     * @param mala
     */
    public Automovel(int lugares, int mala) {
        this.lugares = lugares;
        this.mala = mala;
    }

    /**
     *
     * Construtor com parâmetros de classe e subclasse
     *
     * @param matricula
     * @param marca
     * @param modelo
     * @param quilometros
     * @param lugares
     * @param mala
     */
    public Automovel(String matricula, String marca, String modelo, int quilometros, int lugares, int mala) {
        super(matricula, marca, modelo, quilometros);
        this.lugares = lugares;
        this.mala = mala;
    }

    /**
     * @return número de lugars no automóvel
     */
    public int getLugares() {
        return lugares;
    }

    /**
     *
     * Define o número de lugares
     *
     * @param lugares
     */
    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    /**
     * @return a capacidade da mala em Litros
     */
    public int getMala() {
        return mala;
    }

    /**
     *
     * Define a capacidade da mala em Litros
     *
     * @param mala
     */
    public void setMala(int mala) {
        this.mala = mala;
    }

    /**
     *
     * Método para imprimir os nomes e os valores dos atributos (cada par nome/valor numa linha)
     *
     */
    public void imprimir() {
        System.out.println("Lugares: " + this.lugares);
        System.out.println("Mala (L): " + this.mala);
    }

    /**
     *
     * Método para comparar o total de quilómetros de dois automóveis
     *
     * @param automovel
     * @return
     */
    public int compareKM(Automovel automovel) {
        if (this.getQuilometros() > automovel.getQuilometros()) {
            return 1;
        } else if (automovel.getQuilometros() > this.getQuilometros()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Automovel{" +
                "lugares=" + this.lugares +
                ", mala=" + this.mala +
                '}';
    }

}
