package DadosLeitura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a15006
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {

    public void lerArquivo(String arquivo) {

        try {
            FileReader arq = new FileReader(arquivo);
            FileReader arq2 = new FileReader(arquivo);
            BufferedReader conta_linhas = new BufferedReader(arq);
            Dados d = new Dados();
            int num_linhas = 0;
            while (conta_linhas.readLine() != null) {
                num_linhas++;
            }

            BufferedReader lerArq = new BufferedReader(arq2);
            String linha;
            int tamanho = num_linhas;;
            Dados.setTamanho(tamanho);
            int[][] matriz = new int[tamanho][tamanho];
            linha = lerArq.readLine(); // lê a segunda linha
            while (linha != null) {

                for (int i = 0; i < tamanho; i++) {
                    int j = 0;
                    String[] array = linha.split("-");
                    for (int k = i + 1; k < tamanho; k++) {
                        matriz[i][k] = Integer.valueOf(array[0]);

                        matriz[k][i] = Integer.valueOf(array[1]);
                        j++;
                    }
                    linha = lerArq.readLine();
                }
            }
            Dados.setEntrada(matriz);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }

    public void setDistancias() {
        double[][] matriz = new double[Dados.tamanho][Dados.tamanho];
        for (int i = 0; i < Dados.tamanho; i++) {
            for (int j = i; j < Dados.tamanho; j++) {
                matriz[i][j] = Math.sqrt(Math.pow((Dados.entrada[i][0] - Dados.entrada[j][0]), 2) + Math.pow((Dados.entrada[i][1] - Dados.entrada[j][1]), 2));
                matriz[j][i] = Math.sqrt(Math.pow((Dados.entrada[i][0] - Dados.entrada[j][0]), 2) + Math.pow((Dados.entrada[i][1] - Dados.entrada[j][1]), 2));
            }
        }
        Dados.setDistancias(matriz);
    }
}
