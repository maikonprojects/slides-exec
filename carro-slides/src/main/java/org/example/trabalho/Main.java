package org.example.trabalho;

public class Main {
    public static void main(String[] args) {

        SeguroSaude[] trabalhadores = new SeguroSaude[2];

        trabalhadores[0] = new Chefe("Mario", "Imola", "2311", 2);
        trabalhadores[1] = new Chefe("Luigi", "Los", "0090",4);

        Clube[] trabalhadoresClube = new Clube[2];

        trabalhadoresClube[0] = new TrabalhadorPorComissao("Gui", "Moreira", 4, "2121", "Xadrez");
        trabalhadoresClube[1] = new TrabalhadorPorComissao("Amanda", "Nunes", 10, "1111", "Natação");

        for (int i = 0; i < trabalhadores.length; i++) {
            System.out.println("Matricula: " + trabalhadores[i].getMatriculaPlano());
            System.out.println("Nome: " + trabalhadores[i].getNomeCompletoTitular());
            System.out.println("Quantidade de depedentes: " + trabalhadores[i].getQtdeDependentes());
        }

        for (int i = 0; i < trabalhadoresClube.length; i++) {

            System.out.println("Matricula: " + trabalhadoresClube[i].getMatriculaPlano());
            System.out.println("Nome: " + trabalhadoresClube[i].getNomeCompletoTitular());
            System.out.println("Quantidade de depedentes: " + trabalhadoresClube[i].getQtdeDependentes());
            System.out.println("Clube: " + trabalhadoresClube[i].getNomeClube());
        }

    }
}
