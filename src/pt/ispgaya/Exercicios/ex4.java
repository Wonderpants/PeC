package pt.ispgaya.Exercicios;

import pt.ispgaya.Read;

public class ex4 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int option;
        do {
            System.out.print("Insira um numero: ");
            option = Read.Int();
            if (option > 0 ) {
                positive++;
            } else if (option < 0) {
                negative++;
            }
        } while (option != 0);

        System.out.printf("Positivos: %d\tNegativos: %d", positive, negative);

    }
}
