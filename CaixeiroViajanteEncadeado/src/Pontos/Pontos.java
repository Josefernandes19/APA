/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pontos;

import java.util.Random;

/**
 *
 * @author a15023
 */
public class Pontos {
    public int[][] geraPontosAleatorios(int quantidade){
        int[][] matriz = new int[quantidade][2];
        Random g = new Random();
        for (int i = 0; i < 100; i++) {
            matriz[i][0]=g.nextInt(800);
            matriz[i][1]=g.nextInt(800);
        }
        return matriz;
    }
    
    public double distanciaEuclidiana(int x1, int x2, int y1, int y2){
        double cordx = Math.abs(x1-x2);
        double cordy = Math.abs(y1-y2);
        double distancia = Math.sqrt((cordx*cordx)+(cordy*cordy));
        return distancia;
    }
    
    public double[][] geraMatrizAdjacencia(int matriz[][], int quantidade){
        double[][] adj = new double[quantidade][quantidade];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                adj[i][j] = distanciaEuclidiana(matriz[i][0], matriz[j][0], matriz[i][1], matriz[j][1]);
                adj[j][i] = adj[i][j];
            }
        }
        return adj;
    }
    
}
