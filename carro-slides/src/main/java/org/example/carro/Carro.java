package org.example.carro;


public class Carro {
    //demais atributos da classe
    protected static int qtde;
    protected int tanque;
    protected double precoCusto;
    protected String cor;
    protected String modelo;
    protected double velocidadeAtual;
    protected double velocidadeMaxima;
    protected Motor motor;
    protected String chassi;

    public Carro(String cor, String modelo, double velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void liga() {
        System.out.println("Carro ligado!");
    }

    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        if (velocidadeNova > this.velocidadeMaxima) {
            System.out.println("Atribuída a velocidade máxima.");
            this.velocidadeAtual = this.velocidadeMaxima;
        } else {
            this.velocidadeAtual = velocidadeNova;
        }
    }


    int retornaMarchaAtual() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public static void setQtde(int qtde) {
        Carro.qtde = qtde;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
        this.qtde++;
    }

    public static int getQtde() {
        return qtde;
    }

    public double getPrecoVenda(){
        return precoCusto * 1.3;
    }

    public void setPrecoCusto(int i) {
        this.precoCusto = i;
    }
    //demais métodos da classe
}

