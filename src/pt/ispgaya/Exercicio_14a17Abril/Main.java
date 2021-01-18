package pt.ispgaya.Exercicio_14a17Abril;

import pt.ispgaya.Read;

public class Main {
    public static void main(String[] args) {
        String option = "";
        int classification;

        String menu = "(C) Inserir classificação\n(M) Mau\n(I) Insuficiente\n(S) Suficiente\n(B) Bom\n(MB) Muito Bom\n(F) Fim";

        while (!option.toUpperCase().equals("F")) {
            System.out.print(menu + "\nEscolha a opção pretendida: ");
            option = Read.String();
            if (option.toUpperCase().equals("C")) {
                System.out.print("Inserir Classificação: ");
                classification = Read.Int();
                System.out.print(menu + "\nEscolha a classificação correspondente: ");
                option = Read.String();
                switch (option.toUpperCase()) {
                    case "M":

                        isCorrect(classification >= 0 && classification <= 4);
                        break;
                    case "I":
                        isCorrect(classification >= 5 && classification <= 9);
                        break;
                    case "S":
                        isCorrect(classification >= 10 && classification <= 13);
                        break;
                    case "B":
                        isCorrect(classification >= 14 && classification <= 17);
                        break;
                    case "MB":
                        isCorrect(classification >= 18 && classification <= 20);
                        break;
                    default:
                        System.out.println("Opção invalida.");
                }
            }
        }
    }

    public static void isCorrect(boolean val) {
        if (val) {
            System.out.println("Classificação correta");
        } else {
            System.out.println("Classificação incorreta.");
        }
    }

}
