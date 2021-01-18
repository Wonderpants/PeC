package pt.ispgaya.Projeto_3;

public class ConstroiCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(1.0, 1.0, 5.0);
        Circulo circulo2 = new Circulo(5.0, 2.0, 3.0);

        circulos(circulo1, circulo2);

        circulo1.aumentarRaio(2.0);
        circulo2.aumentarRaio(-1.5);

        circulos(circulo1, circulo2);

        System.out.println("\nCirculo 2");
        System.out.println("Raio: " + circulo2.getRaio());
        System.out.println("Perimetro: " + circulo2.calcularPerimetro());
        System.out.println("Area: " + circulo2.calcularArea());
        System.out.println("E maior: " + circulo2.verificarRaio(circulo1));
    }

    private static void circulos(Circulo circulo1, Circulo circulo2) {
        System.out.println("\nCirculo 1");
        System.out.println("Raio: " + circulo1.getRaio());
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());
        System.out.println("Area: " + circulo1.calcularArea());

        System.out.println("\nCirculo 2");
        System.out.println("Raio: " + circulo2.getRaio());
        System.out.println("Perimetro: " + circulo2.calcularPerimetro());
        System.out.println("Area: " + circulo2.calcularArea());
    }
}
