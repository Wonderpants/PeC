import pt.ispgaya.Read;

public class Main {
    public static void main(String[] args) {

        int preco = 0;

        System.out.println("Qual é o numero de hospedes? ");
        int hospedes = Read.Int();
        while (hospedes > 6) {
            System.out.println("O número máximo de hospedes é 6. Tente novamente!");
            hospedes = Read.Int();
        }

        System.out.println("Qual é o numero de dias? ");
        int dias = Read.Int();
        while (dias > 30) {
            System.out.println("O número máximo de dias de estadia é 30. Tente novamente!");
            dias = Read.Int();
        }

        if (hospedes >= 5) { preco = hospedes*dias*15; }
        else if (hospedes >= 3) { preco = dias*75; }
        else if (hospedes >= 1) { preco = dias*50; }
        System.out.println("O valor total que o proprietário deverá receber é: " + preco);
    }
}
