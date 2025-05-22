package EX2_EX4_Livro;

import Exercicio2Caneta.Exemplo_caneta_azul;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        
         Livro c1 = new Livro("As longas tranças de um careca","Gilberto Barros", 2015);
    
         
         
          System.out.println("\nDeseja emprestar o livro? (s/n)");
         
         teclado.nextLine();
          String opcao = teclado.nextLine();
          if (opcao.equalsIgnoreCase("s")){
          opcao = teclado.nextLine();
          }
          
          System.out.println("\nDeseja devolver o livro?  (s/n)");
          c1.devolver();
          
          if (opcao.equalsIgnoreCase("s")){
          
        c1.emprestar();
              
          }
          
          
          teclado.close();
           
          c1.status();
         
         
         
         
}
}
