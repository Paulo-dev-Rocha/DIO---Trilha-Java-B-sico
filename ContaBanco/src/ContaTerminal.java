import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
            String nome = sc.nextLine();

        System.out.println("Digite sua Agencia: ");
            String agencia = sc.nextLine();
        
        System.out.println("Digite o numero da conta: ");
            int numero = sc.nextInt();
            
        System.out.println("Digite seu saldo: ");
            double saldo = sc.nextDouble();

        
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta  " +numero+ " e seu saldo " +saldo+"R$ já está disponível para saque");
    
        sc.close();
    }
}
