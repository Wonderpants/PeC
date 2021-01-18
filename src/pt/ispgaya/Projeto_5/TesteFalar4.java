package pt.ispgaya.Projeto_5;

import java.util.Scanner;

public class TesteFalar4 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva a frase a ser proferida pelo aluno: ");
        String frase = s.nextLine();
        aluno.falar(frase);
    }

}
