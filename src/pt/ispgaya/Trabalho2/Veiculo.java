package pt.ispgaya.Trabalho2;

/**
 * Classe Veiculo
 */
public class Veiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int quilometros;

    /**
     * Construtor sem parâmetros que inicializa os atributos com valores nulos
     */
    public Veiculo() {
        this.matricula = null;
        this.marca = null;
        this.modelo = null;
        this.quilometros = 0;
    }

    /**
     *
     * Contrutor com parâmetros que inicializa os atributos com os valores dos parâmetros
     *
     * @param matricula
     * @param marca
     * @param modelo
     * @param quilometros
     */
    public Veiculo(String matricula, String marca, String modelo, int quilometros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.quilometros = quilometros;
    }

    /**
     * @return a matrícula
     */
    public String getMatricula() {
        return this.matricula;
    }

    /**
     *
     * Define o valor da matrícula
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return
     */
    public String getMarca() {
        return this.marca;
    }

    /**
     *
     * Define a marca do veículo
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     *
     * Define o modelo do carro
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return
     */
    public int getQuilometros() {
        return this.quilometros;
    }

    /**
     *
     * Define o número de quilómetros
     *
     * @param quilometros
     */
    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    /**
     *
     * Método para imprimir os nomes e os valores dos atributos
     *
     */
    public void imprimir() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Quilómetros: " + this.quilometros);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Veiculo{" +
                "matricula='" + this.matricula + '\'' +
                ", marca='" + this.marca + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", quilometros=" + this.quilometros +
                '}';
    }
}
