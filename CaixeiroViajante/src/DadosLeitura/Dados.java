/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DadosLeitura;

import java.util.List;

/**
 *
 * @author a15006
 */

public class Dados {
    public static int tamanho;
    public static int entrada[][];
    public static double distancias[][];
    public static List<Integer> ordem;

    public static void setOrdem(List<Integer> ordem) {
        Dados.ordem = ordem;
    }

    public static void setTamanho(int tamanho) {
        Dados.tamanho = tamanho;
    }

    public static void setEntrada(int[][] entrada) {
        Dados.entrada = entrada;
    }

    public static void setDistancias(double[][] distancias) {
        Dados.distancias = distancias;
    }
}
