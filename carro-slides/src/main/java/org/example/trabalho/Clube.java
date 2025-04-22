package org.example.trabalho;

public interface Clube extends SeguroSaude{

    public String getNomeClube();

    @Override
    String getMatriculaPlano();

    @Override
    public int getQtdeDependentes();

    @Override
    String getNomeCompletoTitular();
}
