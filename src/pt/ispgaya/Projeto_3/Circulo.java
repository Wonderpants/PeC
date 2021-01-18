package pt.ispgaya.Projeto_3;

public class Circulo {
    double x, y, raio;

    public double getRaio() {
        return raio;
    }

    public Circulo() {
    }

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void aumentarRaio(double num) {
        raio += num;
    }

    public boolean verificarRaio(Circulo circulo) {
        return this.raio > circulo.getRaio();
    }
}
