package br.com.alura.aplicacadecompras.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra>compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if (compra.getValorProduto() <= saldo){
            saldo -= compra.getValorProduto();
            adicionaCompra(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void adicionaCompra(Compra compra){
        this.compras.add(compra);
    }
}
