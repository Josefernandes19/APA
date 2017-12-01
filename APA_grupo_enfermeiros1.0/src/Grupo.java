/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author z3ren
 */
public class Grupo {

    int pontuacao = 0;
    int num_homens;
    int tamanho;
    int[] pessoas;
    int membros;

    public Grupo(int tamanho) {
        this.tamanho = tamanho;
        pessoas = new int[tamanho];
    }

    public void setPontuacao(int[][] matriz) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
//                System.out.println("testansaporra"+matriz[i][j]);
                pontuacao+=matriz[pessoas[i]][pessoas[j]];
            }
        }
        
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public int getNum_homens() {
        return num_homens;
    }

    public void setNum_homens(int num_homens) {
        this.num_homens = num_homens;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adiciona_membro(int idPessoa) {
        pessoas[membros] = idPessoa;
        membros++;
    }

    public void escreveGrupo() {
        System.out.println("Integrantes");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.print(pessoas[i] + " ");
        }
    }
}
