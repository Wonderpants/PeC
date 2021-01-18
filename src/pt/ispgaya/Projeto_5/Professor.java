package pt.ispgaya.Projeto_5;

public class Professor extends Pessoa {

    private int escalao;
    private int docencia;


    public Professor() {
    }

    public Professor(int escalao, int docencia) {
        this.escalao = escalao;
        this.docencia = docencia;
    }

    public Professor(String nome, char genero, int idade, int escalao, int docencia) {
        super(nome, genero, idade);
        //this(escalao, docencia);
        this.escalao = escalao;
        this.docencia = docencia;

    }

    public int getEscalao() {
        return escalao;
    }

    public void setEscalao(int escalao) {
        this.escalao = escalao;
    }

    public int getDocencia() {
        return docencia;
    }

    public void setDocencia(int docencia) {
        this.docencia = docencia;
    }


    @Override
    public void falar() {
        super.falar();
        System.out.println(" e Sou um  Professor");
    }
}
