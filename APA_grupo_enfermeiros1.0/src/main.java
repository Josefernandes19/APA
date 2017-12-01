
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author z3ren
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Reader r = new Reader("input.txt");
        List enfermeiros = new LinkedList<>();

        int[] tamanhos = r.getTamanho_grupo();

        Grupo[] grupos = new Grupo[r.getNum_grupos()];

        for (int i = 0; i < grupos.length; i++) {
            grupos[i] = new Grupo(tamanhos[i]);
            System.out.println("tamanho do grupo " + i + ": " + grupos[i].tamanho);
        }
        for (int i = 0; i < r.getNum_pessoas(); i++) {
            enfermeiros.add(i);
        }
        Collections.shuffle(enfermeiros);
        System.out.println(enfermeiros);
        int j = 0;
        for (int i = 0; i < grupos.length; i++) {

            while (grupos[i].membros < grupos[i].tamanho) {
                System.out.println(r.matriz_relacionamento[i][j]);
                grupos[i].adiciona_membro((int) enfermeiros.get(j));

                j++;
            }
        }
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("Grupo " + (i + 1));
            grupos[i].setPontuacao(r.matriz_relacionamento);
            grupos[i].escreveGrupo();
            System.out.println("");
            System.out.println("Pontuação: " + grupos[i].getPontuacao());
            System.out.println("");
        }
        int soma_total = 0;
        for (int i = 0; i < grupos.length; i++) {
            soma_total += grupos[i].getPontuacao();
        }

        System.out.println("Soma total: " + soma_total);
        int ind_grupo = 0, ind_i = 0, ind_j = 0;
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            ind_grupo = random.nextInt(r.num_grupos);
            ind_i = random.nextInt(grupos[ind_grupo].tamanho);
            ind_j = random.nextInt(grupos[ind_grupo].tamanho);

        }
        System.out.println(ind_i);
        System.out.println(ind_j);
        System.out.println(ind_grupo);
        

    }

}
