/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Perturbacao.Mutacao;
import Perturbacao.Ordem;
import DadosLeitura.Leitura;
import java.util.*;

/**
 *
 * @author a15006
 */
public class Main {

    public static void main(String[] args) {

        Leitura l = new Leitura();
        l.lerArquivo("i.uc");
         l.setDistancias();
        Mutacao m = new Mutacao();
        Ordem ord = new Ordem();
        

        List<Integer> vetor = ord.iniciaVetor();
        double melhorResultado = ord.somaDistancia(vetor);
        List<Integer> melhorVetor = ord.clonaVetor(vetor);

        for (int i = 0; i < 10; i++) {
            vetor = m.executaMutacao(vetor);
//            System.out.println(vetor);
            if (ord.somaDistancia(vetor) < melhorResultado) {

                melhorVetor = ord.clonaVetor(vetor);
                melhorResultado = ord.somaDistancia(vetor);

                //                    System.out.println("Best Result: " + melhorResultado);
            } else {
                vetor = ord.clonaVetor(melhorVetor);
            }

        }
        
        //        System.out.println(ord.somaDistancia(vetor));
        //        System.out.println(melhorResultado);

        //        int cont = 0;
        //        while(ord.somaDistancia(vetor) <= melhorResultado && cont < 80){
        //            System.out.println("entrou");
        //            for (int i = 0; i < 1_000_0; i++) {
        //                vetor = m.executaMutacao(vetor);
        //
        //                if(ord.somaDistancia(vetor) < melhorResultado){
        //                    melhorVetor = ord.clonaVetor(vetor);
        //                    melhorResultado = ord.somaDistancia(vetor);
        //                    System.out.println("Result: " + melhorResultado);
        //                    System.out.println("");
        //                } else {
        //                    vetor = ord.clonaVetor(melhorVetor);
        //                }
        //
        //            }
        //            System.out.println("Aqui");
        //            ord.printaVetor(vetor);
        //            cont ++;
        //            
        //        }
//            System.out.println("");
//            System.out.println(melhorResultado);
//            System.out.println(vetor);
//            System.out.println("");
        vetor = null;
        melhorVetor = null;

        System.out.println("Melhor resultado: ");
        System.out.println(melhorResultado);

    }
}
