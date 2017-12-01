import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class grafo {

  private int[][] mat = new int [34][34];
 
  public grafo (FileReader arquivo) throws IOException {
                
        BufferedReader leitor = new BufferedReader(arquivo);        
        
        //Lê cada linha da instância de entrada;
        for (int i = 0; leitor.ready(); i++) {
            
            //Lê cada valor das colunas;
            String[] linha = leitor.readLine().split("	");
            
            for (int j = 0; j < linha.length; j++) {
                
                //Atribuição da matriz
                this.mat[i][j] = Integer.valueOf(linha[j]);                
            }
        }  
    }
  
  public void printaGraf(){
      int x = 0;
      for(int i=0; i<34; i++){
            for(int j=0; j<34; j++){
            System.out.print(this.mat[i][j] + "|    |");
            }
            System.out.println("");
//            if(this.mat[i][j] != this.mat[j][i]){
//        
//                System.out.println(i);
//            }
       }
            
      }
  
  public int getValor(int i, int j){
      return this.mat[i][j];
  }
            
  }
  

  


