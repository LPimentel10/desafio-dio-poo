import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador elevador = null;

        System.out.println("Escolha o tipo de elevador:");
        System.out.println("1 - Elevador Comum");
        System.out.println("2 - Elevador de Carga");

        int tipoElevador = scanner.nextInt();

        switch (tipoElevador) {
            case 1:
                elevador = new ElevadorComum(10, 5);
                break;
            case 2:
                elevador = new ElevadorDeCarga(10, 10);
                break;
            default:
                System.out.println("Tipo de elevador inválido.");
                return;
        }

        Predio predio = new Predio(elevador);

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Ir para um andar");
            System.out.println("2 - Entrar pessoas");
            System.out.println("3 - Sair pessoas");
            System.out.println("0 - Sair");

            int operacao = scanner.nextInt();

            if (operacao == 0) {
                break;
            }

            int pessoas = 0;
            int andar = 0;

            if (operacao == 1) {
                System.out.println("Escolha o andar (0 a " + (elevador.totalAndares) + "):");
                andar = scanner.nextInt();
            } else if (operacao == 2 || operacao == 3) {
                System.out.println("Quantas pessoas?");
                pessoas = scanner.nextInt();
            }

            predio.usarElevador(operacao, pessoas, andar);

            System.out.println("Andar atual: " + predio.getAndarAtual());
            System.out.println("Ocupação atual: " + predio.getOcupacaoAtual());
        }

        scanner.close();
    }
}
