package pt.ispgaya.Projeto_5;

import java.util.Scanner;

public class Pessoa {

    //Atributos
    private String nome;
    private char genero;
    private int idade;

    //Construtor
    public Pessoa() {
    }

    //Métodos

    public Pessoa(String n, char g) {
        this.nome = n;
        this.genero = g;
    }


    public Pessoa(String n, char g, int i) {
        this(n, g);//Utiliza o construtor anterior
        this.idade = i;
    }

    public static void main(String[] args) {
        // Declara o objeto pessoa1
        Pessoa pessoa1;
        pessoa1 = new Pessoa();
        pessoa1.setNome("Carla");
        pessoa1.setGenero('F');
        pessoa1.setIdade(12);
        System.out.println("O objeto pessoa1 chama-se  " + pessoa1.getNome() + " é do género " + pessoa1.getGenero()
                + " tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();

        //Declara o objeto pessoa2
        Pessoa pessoa2;
        pessoa2 = new Pessoa();
        pessoa2.setNome("João");
        pessoa2.setGenero('M');
        pessoa2.setIdade(18);
        System.out.println("O objeto pessoa2 chama-se  " + pessoa2.getNome() + " é do género " + pessoa2.getGenero()
                + " tem " + pessoa2.getIdade() + " anos e diz: ");
        pessoa2.falar();

        Scanner s = new Scanner(System.in);
        System.out.print("Insira o nome da pessoa 3");
        String n = s.nextLine();
        System.out.println("Insira o género da pessoa 3");
        String gen = s.nextLine();
        char g = gen.charAt(0);
        System.out.println("Insira a idade da pessoa 3");
        //int i= s.nextLine();
        Pessoa pessoa3;
        pessoa3 = new Pessoa(n, g);
        System.out.println("O objeto pessoa3 chama-se  " + pessoa3.getNome() + " é do género " + pessoa3.getGenero()
                + " e diz: ");
        pessoa3.falar();

    }

    /**
     * @param frase
     */
    public void falar(String frase) {
        System.out.println(frase);
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    void falar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
