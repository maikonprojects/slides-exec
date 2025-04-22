package org.example.carro;

public class CarroGnv extends Carro {

    int qtdeCilindros;
    String autorizacaoINMETRO;

    @Override
    public double getPrecoVenda() {
        return precoCusto * 1.4;
    }
}
