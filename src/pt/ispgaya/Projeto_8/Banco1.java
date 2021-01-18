package pt.ispgaya.Projeto_8;

public class Banco1 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Bruno Cunha", 100);
        System.out.println(conta1);

        conta1.deposit(100);
        System.out.println(conta1);

        conta1.withdraw(20);
        System.out.println(conta1);

        ContaBancaria conta2 = new ContaBancaria("Diogo Fernandes", 100);
        System.out.println(conta2);
    }
}
