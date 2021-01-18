package pt.ispgaya.Projeto_6;

public class FazCalculos1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("\nSoma: " + calculadora.Somar(2.7, 5.2));
        System.out.println("Subtração: " + calculadora.Subtrair(2.7, 5.2));
        System.out.println("Multiplicação: " + calculadora.Multiplicar(2.7, 5.2));
        System.out.println("Divisão: " + calculadora.Dividir(2.7, 5.2));
    }
}
