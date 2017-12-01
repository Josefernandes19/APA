
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author z3ren
 */
public class Reader {

    String path;
    int num_pessoas;
    int num_grupos;
    int num_homens=0;
    int[] tamanho_grupo;
    int[][] matriz_relacionamento;

    public int getNum_pessoas() {
        return num_pessoas;
    }
    public int getNum_Homens() {
       
        for (int i = 0; i < matriz_relacionamento.length; i++) {
            for (int j = 0; j < matriz_relacionamento.length; j++) {
                if(matriz_relacionamento[i][j] == -1000){
                    num_homens++;
                }
            }
        }
        return num_homens/2;
    }
    
    public int getNum_grupos() {
        return num_grupos;
    }

    public int[] getTamanho_grupo() {
        return tamanho_grupo;
    }

    public int[][] getMatriz_relacionamento() {
        return matriz_relacionamento;
    }

    public Reader(String path) throws FileNotFoundException {
        this.path = path;
        read();

    }

    public void read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(path));
        String row;

        row = scanner.next();
        row = scanner.next();

        num_pessoas = Integer.parseInt(row);
        row = scanner.next();
        row = scanner.next();
        matriz_relacionamento = new int[num_pessoas][num_pessoas];

        num_grupos = Integer.parseInt(row);
        int cont = 0;
        tamanho_grupo = new int[num_grupos];
        while (cont < num_grupos) {
            row = scanner.next();
            row = scanner.next();

            tamanho_grupo[cont] = Integer.parseInt(row);
            cont++;

        }
        System.out.println("Pessoas: " + num_pessoas);
        System.out.println("Grupos: " + num_grupos);

        for (int i = 0; i < tamanho_grupo.length; i++) {
            System.out.println("G" + i + " " + tamanho_grupo[i]);
        }

        while (scanner.hasNext()) {
            for (int i = 0; i < num_pessoas; i++) {
                for (int j = 0; j < num_pessoas; j++) {
                    row = scanner.next();
                    matriz_relacionamento[i][j] = Integer.parseInt(row);
                }
            }
        }
        for (int i = 0; i < matriz_relacionamento.length; i++) {
            for (int j = 0; j < matriz_relacionamento.length; j++) {
                System.out.print(matriz_relacionamento[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public Aresta[] getArestas(int u){
        Aresta[] arestas = new Aresta[num_pessoas];
        for (int i = 0; i < num_pessoas; i++) {
            arestas[i] = new Aresta(u, i, matriz_relacionamento[u][i]);
        }
        return arestas;
    }
}
