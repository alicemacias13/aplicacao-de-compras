package br.com.alura.aplicacaodecompras.principal;
import br.com.alura.aplicacadecompras.modelos.CartaoDeCredito;
import br.com.alura.aplicacadecompras.modelos.Compra;
import java.util.Scanner;
import java.util.Collections;


public class Principal {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("APLICAÇÃO DE COMPRAS");
        System.out.println("--------------------");

        System.out.print("Digite o limite do cartão: ");
        Scanner scanner = new Scanner(System.in);
        double limite = scanner.nextInt();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);


        int opcao = 0;
        while (opcao != 2){
            System.out.print("Digite o que você quer comprar: ");
            String produto = scanner.next();

            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(valor, produto);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Saldo do cartão: " + cartao.getSaldo());
            } else {
                System.out.println("Saldo insuficiente!");
            }
            System.out.print("Deseja continuar? SIM [1] ou NAO [2]: ");
            opcao = scanner.nextInt();
        }
        System.out.println("********************");
        System.out.println("Compras realizadas: ");
        System.out.println("********************");
        Collections.sort(cartao.getCompras());
        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra.getNomeProduto() + " - " + compra.getValorProduto());
        }
        System.out.println("********************");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
        System.out.println("Obrigado por usar nosso programa!");
    }
}
