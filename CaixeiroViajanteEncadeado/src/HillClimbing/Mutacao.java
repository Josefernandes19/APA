/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HillClimbing;

import java.util.*;

/**
 *
 * @author a15023
 */
public class Mutacao {
    public List<Integer> executaMutacao(List<Integer> vetor){
        Ordem o = new Ordem();
        Random g = new Random();
        
        int chamada = g.nextInt(4);
        switch (chamada) {
            case 0:
                vetor = o.swapVetor(vetor);
                break;
            case 1:
                vetor = o.insertionVetor(vetor);
                break;
            case 2:
                vetor = o.inversionVetor(vetor);
                break;
            default:
                o.shuffleVetor(vetor);
                break;
        }
        return vetor;
    }
}
