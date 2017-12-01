
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cmatos13
 */
public class agrupar {
    
    List enfermeiros = new ArrayList();
    ArrayList <Integer> grupo1 = new ArrayList();
    ArrayList <Integer>grupo2 = new ArrayList();
    ArrayList <Integer>grupo3 = new ArrayList();
    ArrayList <Integer>grupo4 = new ArrayList();
    ArrayList <Integer>grupo5 = new ArrayList();
    ArrayList <Integer>grupo6 = new ArrayList();
    ArrayList <Integer>grupo7 = new ArrayList();
    
    public int[] pontuacao = {0,0,0,0,0,0,0};
    public int pontuacaoTotal =0;
    
    
   public void incializa(){
       for(int i=0;i<5;i++){
           enfermeiros.add(1);
       }
       for(int i=0;i<5;i++){
           enfermeiros.add(2);
       }
       for(int i=0;i<5;i++){
           enfermeiros.add(3);
       }
       for(int i=0;i<5;i++){
           enfermeiros.add(4);
       }
       for(int i=0;i<5;i++){
           enfermeiros.add(5);
       }
       for(int i=0;i<5;i++){
           enfermeiros.add(6);
       }
       for(int i=0;i<4;i++){
           enfermeiros.add(7);
       }
       
   } 
   
   public void printVet(){
       System.out.println(enfermeiros.toString());
       
   }
   
   public void agrupa(){
       
       Collections.shuffle(enfermeiros);
        
       for (int i = 0; i < 34; i++) {
            int op = (int) enfermeiros.get(i);
            switch(op){
                case 1:
                    grupo1.add(i);
                    break;
                case 2:
                    grupo2.add(i);
                    break;
                case 3:
                    grupo3.add(i);
                    break;
                case 4:
                    grupo4.add(i);
                    break;
                case 5:
                    grupo5.add(i);
                    break;
                case 6:
                    grupo6.add(i);
                    break;
                case 7:
                    grupo7.add(i);
                    break;    
            }
        }
       
//        System.out.println("############  Grupos #############");
//        System.out.println(grupo1.toString());
//        System.out.println(grupo2.toString());
//        System.out.println(grupo3.toString());
//        System.out.println(grupo4.toString());
//        System.out.println(grupo5.toString());
//        System.out.println(grupo6.toString());
//        System.out.println(grupo7.toString());     
   }
   
   public int verificaRelacao(int i,int j, grafo g){
       return g.getValor(i, j);
   }
   
   
   public int pontuar(grafo g){
       
       
       
       for(int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                pontuacao[0] = pontuacao[0] + verificaRelacao(grupo1.get(i), grupo1.get(j), g);
            }
        }
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                pontuacao[1] = pontuacao[1] + verificaRelacao(grupo2.get(i), grupo2.get(j), g);
            }
        }
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                pontuacao[2] = pontuacao[2] + verificaRelacao(grupo3.get(i), grupo3.get(j), g);
            }
        }
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                pontuacao[3] = pontuacao[3] + verificaRelacao(grupo4.get(i), grupo4.get(j), g);
            }
        }
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                pontuacao[4] = pontuacao[4] + verificaRelacao(grupo5.get(i), grupo5.get(j), g);
            }
        }
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++) {
                pontuacao[5] = pontuacao[5] + verificaRelacao(grupo6.get(i), grupo6.get(j), g);
            }
        }
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++) {
                pontuacao[6] = pontuacao[6] + verificaRelacao(grupo6.get(i), grupo6.get(j), g);
            }
        }
        
        
        
        for(int i = 0; i<7;i++){
            pontuacaoTotal = pontuacaoTotal + pontuacao[i];
        }
        
        return pontuacaoTotal;
   
   }
   
   public void printaPontuacao() {
       
            
            System.out.println("########### Pontuação ############");
            for(int i =0; i<7;i++){
                System.out.println("Pontuação Grupo "+ i + ": " + pontuacao[i]);
            }
            
            System.out.println("Pontuação Total:" + pontuacaoTotal);
            
            
    
   }
   
   public int retornaPontuacao(){
       return pontuacaoTotal;
   }
    
   public void zerar(){
       List enfermeiros = new ArrayList();
    ArrayList <Integer> grupo1 = new ArrayList();
    ArrayList <Integer>grupo2 = new ArrayList();
    ArrayList <Integer>grupo3 = new ArrayList();
    ArrayList <Integer>grupo4 = new ArrayList();
    ArrayList <Integer>grupo5 = new ArrayList();
    ArrayList <Integer>grupo6 = new ArrayList();
    ArrayList <Integer>grupo7 = new ArrayList();
    
     int[] pontuacao = {0,0,0,0,0,0,0};
     int pontuacaoTotal =0;
   }
    
    
}
