package pt.ispgaya.Exercicios;

import pt.ispgaya.Read;

public class ex6 {
    public static void main(String[] args) {
        System.out.print("Indique o comprimento do retangulo: ");
        int width = Read.Int();
        System.out.print("Indique a altura do retangulo: ");
        int height = Read.Int();
        System.out.println("X".repeat(width));
        for (int i = 0; i < height-2; i++) {
            System.out.println("X" + " ".repeat(width-2) + "X");
        };
        System.out.println("X".repeat(width));
    }
}
