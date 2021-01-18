package pt.ispgaya.Projeto_6;

public class FazCalculos {
    public static void main(String[] args) {
        Cientifica cf = new Cientifica();

        System.out.println("Soma dos Valores 10.5 e 17.1 = " + cf.Somar(10.5, 17.1));
        System.out.println("Potencia de 3 elevado a 2 = " + cf.Pot(3, 2));
        System.out.println("Raiz quadrada de 25 = " + cf.Raiz(25));
    }
}
