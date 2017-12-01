/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.util.List;

/**
 *
 * @author Felipe - Diablo
 */
public class Dados {
    public static int tamanho;
    public static double entrada[][];
    public static List<Integer> vetor;

    public static void setTamanho(int tamanho) {
        Dados.tamanho = tamanho;
    }

    public static void setEntrada(double[][] entrada) {
        Dados.entrada = entrada;
    }
}
