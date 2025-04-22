package org.example.trabalho;

public class TrabalhadorPorComissao extends Trabalhadores implements SeguroSaude, Clube{

    private String nomeClube;

    public TrabalhadorPorComissao(String nome, String sobrenome, int depedentes, String matricula, String nomeClube) {
        super(nome, sobrenome);
        qtdDepedentes = depedentes;
        matriculPlano = matricula;
        this.nomeClube = nomeClube;
    }

    @Override
    public String getMatriculaPlano() {
        return matriculPlano;
    }

    @Override
    public int getQtdeDependentes() {
        return qtdDepedentes;
    }


    @Override
    public double gerarSalario() {
        return 0;
    }

    @Override
    public String getNomeClube() {
        return nomeClube;
    }
}
