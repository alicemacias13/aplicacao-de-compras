import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("APLICAÇÃO DE COMPRAS");
        System.out.println("--------------------");

        System.out.print("Digite o limite do cartão: ");
        Scanner scanner = new Scanner(System.in);
        double limite = scanner.nextInt();

        int opcao = 0;
        while (opcao != 2){
            System.out.print("Digite o que você quer comprar: ");
            String produto = scanner.next();

            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            if (valor < limite) {
                System.out.println("Compra realizada com sucesso!");
                limite -= valor;
                System.out.println("Saldo do cartão: " + limite);
            } else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Deseja continuar? SIM [1] ou NAO [2]");
            opcao = scanner.nextInt();
        }

        System.out.println("Obrigado por usar nosso programa!");
        System.out.println(Produto);
    }
}
