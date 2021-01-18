package pt.ispgaya.Projeto_5;

public class Aluno extends Pessoa{

    public Aluno(int numero, String turma) {
        this.numero = numero;
        this.turma = turma;
    }

    public Aluno() {
    }
    public Aluno(String nome, char genero,int idade,int numero,String turma){
        super(nome,genero,idade);
        this.numero = numero;
        this.turma = turma;
    }
    private int numero;
    private String turma;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }


    @Override
    public  void falar () {
        super.falar();
        System.out.println(" e Sou um aluno ");
    }

}
