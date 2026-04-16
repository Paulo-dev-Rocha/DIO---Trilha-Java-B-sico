import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;

                case 2:
                    double saque = scanner.nextDouble();
                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    return; // ? IMPORTANTE: encerra o programa na hora

                default:
                    break;
                    
            }
        }
    }scanner.close();
}