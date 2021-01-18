package pt.ispgaya.Exercicios;

import pt.ispgaya.Read;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Escreva uma mensagem");
        String msg = Read.String();
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
        }
    }
}
