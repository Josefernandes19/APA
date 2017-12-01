/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cmatos13
 */
public class main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader caminho = new FileReader("C:\\Users\\cmatos13\\Documents\\instancia.txt");
        grafo graf = new grafo(caminho);
        
        //graf.printaGraf();
        
        agrupar a = new agrupar();
        a.incializa();
        a.agrupa();
        a.pontuar(graf);
//        a.printaPontuacao();
//        System.out.println("################");
        
        
        for(int i = 0;i<100000;i++){     
            agrupar b = new agrupar();    
            b.incializa();
            b.agrupa();
            b.pontuar(graf);
            System.out.println("Interação:" + i);
           
            
            if(b.retornaPontuacao()>a.retornaPontuacao()){
                System.out.println("Parabéns!!");
                a = b;
            }
            
        }
        
        System.out.println("################");
        a.printVet();
        System.out.println("################");
        a.printaPontuacao();
        System.out.println("################");
        
        
    
        
    }
    
}
