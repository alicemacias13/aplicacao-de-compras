package br.com.alura.aplicacadecompras.modelos;

public class Compra implements Comparable<Compra>{
    private String nomeProduto;
    private double valorProduto;

    public Compra(double valorProduto, String nomeProduto) {
        this.valorProduto = valorProduto;
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return "Compra: nomeProduto = " + nomeProduto +
                "valorProduto = " + valorProduto;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(outraCompra.getValorProduto()));
    }
}
