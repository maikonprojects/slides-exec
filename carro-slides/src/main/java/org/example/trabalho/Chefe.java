package org.example.trabalho;

public class Chefe extends Trabalhadores implements SeguroSaude{


    public Chefe(String nome, String sobrenome, String matricula, int dependentes) {
        super(nome, sobrenome);
        matriculPlano = matricula;
        qtdDepedentes = dependentes;
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
    // Demais métodos da classe.
}

