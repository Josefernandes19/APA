/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perturbacao;

import java.util.*;

/**
 *
 * @author a15006
 */
public class Mutacao {

    public List<Integer> executaMutacao(List<Integer> vetor) {
        List<Integer> out_array;
        Ordem ord = new Ordem();
        Random rand = new Random();

        int operador = rand.nextInt(4);

        switch (operador) {
            case 0:
                vetor = ord.insertionVetor(vetor);
                break;
            case 1:
                vetor = ord.swapVetor(vetor);
                break;

            case 2:
                ord.shuffleVetor(vetor);
                break;

            default:
                vetor = ord.inversionVetor(vetor);
                break;
        }
        out_array = ord.clonaVetor(vetor);
        return out_array;
    }
}
