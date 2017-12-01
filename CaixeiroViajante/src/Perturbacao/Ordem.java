/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perturbacao;

import DadosLeitura.Dados;
import java.util.*;

/**
 *
 * @author a15023
 */
public class Ordem {
    public List<Integer> iniciaVetor(){
        List<Integer> vetor = new ArrayList<>();
        for (int i = 0; i < Dados.tamanho; i++) {
            vetor.add(i);
        }
        return vetor;
    }
    
    public List<Integer> clonaVetor(List<Integer> vetor){
        List<Integer> newVetor = new ArrayList<>();
        for (int i = 0; i < Dados.tamanho; i++) {
            newVetor.add(vetor.get(i));
        }
        return newVetor;
    }

    public void printaVetor(List<Integer> vetor){
        System.out.print("Vetor: ");
        for (int i = 0; i < Dados.tamanho; i++) {
            System.out.print(vetor.get(i) + " ");
        }
    }
    
    public List<Integer> swapVetor(List<Integer> vetor){
        Random g = new Random();
        int num1 = g.nextInt(Dados.tamanho-1) + 1;
        int aux = vetor.get(num1);
        int num2 = g.nextInt(Dados.tamanho-1) + 1;
        vetor.set(num1, vetor.get(num2));
        vetor.set(num2, aux);
        return vetor;
    }
    
    public List<Integer> insertionVetor(List<Integer> vetor){
        Random g = new Random();
        int num1 = g.nextInt(Dados.tamanho-1) + 1;
        int aux = vetor.get(num1);
        vetor.remove(num1);
        int num2 = g.nextInt(Dados.tamanho-1) + 1;
        vetor.add(num2, aux);
        return vetor;
    }
    
    public List<Integer> inversionVetor(List<Integer> vetor){
        Random g = new Random();
        int num1 = g.nextInt(Dados.tamanho-1) + 1;
        int num2 = g.nextInt(Dados.tamanho-1) + 1;
        if(num1 > num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        List<Integer> dados = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            dados.add(vetor.get(i));
        }
        for (int i = num2; i >= num1; i--) {
            vetor.set(i, dados.get(0));
            dados.remove(0);
        }
        return vetor;
    }
    
    public List<Integer> shuffleVetor(List<Integer> vetor){
        Random g = new Random();
        int num1 = g.nextInt(Dados.tamanho-1) + 1;
        int num2 = g.nextInt(Dados.tamanho-1) + 1;
        if(num1 > num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        List<Integer> dados = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            dados.add(vetor.get(i));
        }
        Collections.shuffle(dados);
        for (int i = num2; i >= num1; i--) {
            vetor.set(i, dados.get(0));
            dados.remove(0);
        }
        return vetor;
    }
    
    public double somaDistancia(List<Integer> vetor){
        
        
        double soma = Dados.distancias[vetor.get(Dados.tamanho-1)][vetor.get(0)];
        
        for (int i = 1; i < Dados.tamanho; i++) {
            soma = soma + Dados.distancias[vetor.get(i-1)][vetor.get(i)];
        }
        
        
        return soma;
    }
}
