package org.example;

import java.math.BigInteger;
import java.util.Objects;

public class Rainha {

    public static void main(String[] args) {
        int tabuleiro[][] = new int[8][8];
        long tabuleiroLong[][] = new long[8][8];

        int contGraoInt = 0;
        long contGraoLong = 0;
        int ax = 0;

        int indexOverflowInt = 0;
        int indexOverflowLong = 0;

        long maxLong = 1;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                ax++;
                double pot = Math.pow(2, ax);

                tabuleiro[i][j] = (int) pot;
                tabuleiroLong[i][j] = (long) pot;

                // Verifica overflow para int
                if (tabuleiro[i][j] == 2147483647  && indexOverflowInt == 0) {
                    indexOverflowInt = ax;
                }

                // Verifica overflow para long
                if (tabuleiroLong[i][j] <= maxLong && indexOverflowLong == 0 && ax > 1) {
                    indexOverflowLong = ax;
                }

                maxLong = tabuleiroLong[i][j];
            }
        }

        System.out.println(indexOverflowInt + "° é o index do overflow do tabuleiro em int");
        System.out.println(indexOverflowLong + "° é o index do overflow do tabuleiro em long");
    }
}
