
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author z3ren
 */
public class Relacoes {

    Reader r;
    int[][] matriz_relacionamentos;

    public Relacoes() throws FileNotFoundException {
        this.r = new Reader("input.txt");
        this.matriz_relacionamentos = r.getMatriz_relacionamento();
    }

    public Aresta[] getArestas(int u) {
        Aresta[] arestas = new Aresta[r.getNum_pessoas()];
        for (int i = 0; i < r.getNum_pessoas(); i++) {
            arestas[i] = new Aresta(u, i, matriz_relacionamentos[u][i]);
        }
        return arestas;
    }

    public int getRelacao(int u, int v) {
        return matriz_relacionamentos[u][v];
    }

}
