package pt.ispgaya.Projeto_6;

import java.util.Scanner;

public class FazCalculos2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 Numero: ");
        double op1 = scanner.nextDouble();

        System.out.print("2 Numero: ");
        double op2 = scanner.nextDouble();

        System.out.println("\nSoma: " + calculadora.Somar(op1, op2));
        System.out.println("Subtração: " + calculadora.Subtrair(op1, op2));
        System.out.println("Multiplicação: " + calculadora.Multiplicar(op1, op2));
        System.out.println("Divisão: " + calculadora.Dividir(op1, op2));
    }
}
