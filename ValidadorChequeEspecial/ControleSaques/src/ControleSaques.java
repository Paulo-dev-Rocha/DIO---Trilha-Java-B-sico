import java.util.Scanner;

public class ControleSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0;

        for (;;) { // loop infinito
            double saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (totalSacado + saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            totalSacado += saque;
            double restante = limiteDiario - totalSacado;

            System.out.println("Saque realizado. Limite restante: " + restante);
        }

        scanner.close();
    }
}