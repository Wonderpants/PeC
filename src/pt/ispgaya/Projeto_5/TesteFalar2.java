package pt.ispgaya.Projeto_5;

import java.util.Scanner;

public class TesteFalar2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa pessoa;

        System.out.println("Insira o tipo de pessoa,Aluno (A) ou Professor(P) ");
        String tipoPessoa = s.nextLine();
        if (tipoPessoa.equals("A")||tipoPessoa.equals("a"))
            pessoa = new Aluno("Pedro Martins ",'M', 23, 1 ,"A");
        else if (tipoPessoa.equals("P")||tipoPessoa.equals("p"))
            pessoa = new Professor("Helena Lopes ",'F', 40, 550, 2);
        else{
            pessoa = new Pessoa();
            System.err.println("O tipo de pessoa que inseriu não existe");
        }
        System.out.println("Olá ,meu nome é " + pessoa.getNome() + "Sou do sexo"+ pessoa.getGenero()+ " e tenho "+ pessoa.getIdade()+ "anos");
        if (pessoa instanceof Aluno)
            System.out.println("Olá meu número é"+((Aluno)pessoa).getNumero()+"e minha turma é"+((Aluno)pessoa).getTurma());
        else if (pessoa instanceof Professor)
            System.out.println("Olá meu Grupo de docente é:" + ((Professor)pessoa).getDocencia() + "e o meu escalão é:"+((Professor)pessoa).getEscalao());

        pessoa.falar();
    }
}
