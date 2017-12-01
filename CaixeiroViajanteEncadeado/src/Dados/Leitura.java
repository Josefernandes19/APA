package Dados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe - Diablo
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Leitura {
 
    public void lerArquivo(String arquivo){
 
        try {
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            Dados d = new Dados();
            
            String linha = lerArq.readLine(); // lê a primeira linha
            int tamanho = Integer.valueOf(linha);
            Dados.setTamanho(tamanho);
            double[][] matriz = new double[tamanho][tamanho];
            linha = lerArq.readLine(); // lê a segunda linha
            while (linha != null) {
                for (int i = 0; i < tamanho; i++) {
                    int j=0;
                    String[] array = linha.split(" ");
                    for (int k = i + 1; k < tamanho; k++) {
                        matriz[i][k] = Integer.valueOf(array[j]);
                        matriz[k][i] = Integer.valueOf(array[j]);
                        j++;
                    }
                linha = lerArq.readLine();
                }
            }
            Dados.setEntrada(matriz);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        }
    }
}