/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dados.*;
import HillClimbing.*;
import Pontos.*;
import java.util.*;

/**
 *
 * @author a15023
 */
public class Principal {
    public static void main(String[] args) {
        Pontos p = new Pontos();
        Printar gui = new Printar();
        gui.iniciaPrint();
        Dados.tamanho = 100;
        int[][] matriz = p.geraPontosAleatorios(Dados.tamanho);
        Dados.entrada = p.geraMatrizAdjacencia(matriz, Dados.tamanho);
        Mutacao m = new Mutacao();
        Ordem o = new Ordem();
        //for (int j = 0; j < 100; j++) {
        List<Integer> vetor = o.iniciaVetor();
        double melhorResultado = o.somaDistancia(vetor);
        List<Integer> melhorVetor = o.clonaVetor(vetor);
            for (int i = 0; i < 500_000; i++) {
                vetor = m.executaMutacao(vetor);
                if(o.somaDistancia(vetor) < melhorResultado){
                    melhorVetor = o.clonaVetor(vetor);
                    melhorResultado = o.somaDistancia(vetor);
                    Dados.vetor = melhorVetor;
                    gui.repaint();
                } else {
                    vetor = o.clonaVetor(melhorVetor);
                }
            }
            System.out.println(melhorResultado);
            o.printaVetor(vetor);
            System.out.println("");
        //}
    }
}
