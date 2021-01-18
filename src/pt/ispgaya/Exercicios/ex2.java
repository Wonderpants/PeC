package pt.ispgaya.Exercicios;

import pt.ispgaya.Read;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Escreva um número de 1 a 4");
        int option = Read.Int();
        if (option < 1 || option > 4) {
            System.out.println("Numero invalido");
        } else {
            switch (option) {
                case 1:
                    System.out.println("Inverno");
                    break;
                case 2:
                    System.out.println("Primavera");
                    break;
                case 3:
                    System.out.println("Verão");
                    break;
                case 4:
                    System.out.println("Outono");
            }
        }
    }
}
