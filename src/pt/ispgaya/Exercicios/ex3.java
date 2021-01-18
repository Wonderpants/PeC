package pt.ispgaya.Exercicios;

import pt.ispgaya.Read;

public class ex3 {
    public static void main(String[] args) {
        int figure;
        double area;
        System.out.print("1) Circulo\n2) Retangulo\n3)Triangulo\nIndique a figura geometrica: ");
        figure = Read.Int();
        switch (figure) {
            case 1:
                System.out.print("Indique o raio do circulo: ");
                int radius = Read.Int();
                area = Math.PI+Math.pow(radius, 2);
                System.out.printf("A area do circulo é %.2f", area);
                break;
            case 2:
                System.out.print("Indique a largura do retangulo: ");
                int width = Read.Int();
                System.out.print("Indique o comprimento do retangulo: ");
                int length = Read.Int();
                area = width*length;
                System.out.printf("A area do retangulo é %.2f", area);
                break;
            case 3:
                System.out.print("Indique a altura do triangulo: ");
                int height = Read.Int();
                System.out.print("Indique o comprimento da base do triangulo: ");
                int base = Read.Int();
                area = (height*base)/2.0;
                System.out.printf("A area do triangule é %.2f", area);
                break;
        }
    }
}
