package org.example.trabalho;

public abstract class Trabalhadores implements SeguroSaude{
    private String nome;
    private String sobrenome;
    protected String matriculPlano;
    protected int qtdDepedentes;
    private double salarioBase;

    public Trabalhadores(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public abstract double gerarSalario();

    @Override
    public String getNomeCompletoTitular() {
        return nome +" " + sobrenome;
    }
}

