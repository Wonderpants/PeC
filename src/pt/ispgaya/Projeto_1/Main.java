package pt.ispgaya.Projeto_1;

import pt.ispgaya.Read;

public class Main {

    static boolean contribuinteValido(String vatNumber) {
        final int maxDigits = 9;
        if (!vatNumber.matches("[0-9]+") || vatNumber.length() != maxDigits) return false;
        int checkSum = 0;
        for (int i = 0; i < maxDigits - 1; i++) { checkSum += (vatNumber.charAt(i) - '0') * (maxDigits - i); }
        int checkDigit = 11 - (checkSum % 11);
        if (checkDigit >= 10) checkDigit = 0;
        return checkDigit == vatNumber.charAt(maxDigits - 1) - '0';
    }

    static boolean ValidateNumeroDocumentoCC(String numeroDocumento) throws Exception {
        int sum = 0;
        boolean secondDigit = false;
        if(numeroDocumento.length() != 12)
            throw new Exception("Tamanho inválido para número de documento.");
        for (int i = numeroDocumento.length()-1; i >= 0; --i)
        {
            int valor = GetNumberFromChar(String.valueOf(numeroDocumento).charAt(i));
            if (secondDigit)
            {
                valor *= 2;
                if (valor > 9)
                    valor -= 9;
            }
            sum += valor;
            secondDigit = !secondDigit;
        }
        return (sum % 10) == 0;
    }

    static int GetNumberFromChar(char letter) throws Exception {
        switch(letter)
        {
            case '0' : return 0;
            case '1' : return 1;
            case '2' : return 2;
            case '3' : return 3;
            case '4' : return 4;
            case '5' : return 5;
            case '6' : return 6;
            case '7' : return 7;
            case '8' : return 8;
            case '9' : return 9;
            case 'A' : return 10;
            case 'B' : return 11;
            case 'C' : return 12;
            case 'D' : return 13;
            case 'E' : return 14;
            case 'F' : return 15;
            case 'G' : return 16;
            case 'H' : return 17;
            case 'I' : return 18;
            case 'J' : return 19;
            case 'K' : return 20;
            case 'L' : return 21;
            case 'M' : return 22;
            case 'N' : return 23;
            case 'O' : return 24;
            case 'P' : return 25;
            case 'Q' : return 26;
            case 'R' : return 27;
            case 'S' : return 28;
            case 'T' : return 29;
            case 'U' : return 30;
            case 'V' : return 31;
            case 'W' : return 32;
            case 'X' : return 33;
            case 'Y' : return 34;
            case 'Z' : return 35;
        }
        throw new Exception("Valor inválido no número de documento.");
    }

    public static void main(String[] args) throws Exception {
        String Cidadao;
        String Contribuinte;
        boolean ContribuinteValido = false;

        System.out.print("Introduza o número de cartão de cidadão: ");
        Cidadao = Read.String();
        if ( !contribuinteValido(Cidadao) ) {
            System.out.println("O número de cartão de cidadão '" + Cidadao + "' não é valido.");
        }

        System.out.print("Introduza o número de contribuinte: ");
        Contribuinte = Read.String();
        try {ContribuinteValido = ValidateNumeroDocumentoCC(Contribuinte);
        } catch (Exception ignore) {
            if ( !ContribuinteValido ) { System.out.println("O número de contribuinte '" + Cidadao + "' não é valido."); }
        }

    }
}
