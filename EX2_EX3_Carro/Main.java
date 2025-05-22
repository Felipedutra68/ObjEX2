package EX2_EX3_Carro;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       Carro car = new Carro("Chevrole", "onix", 2015);

        car.setLigado(true);
       
        System.out.println("\nDeseja desligar o carro?  (s/n)");
        
        
teclado.nextLine();
        String opcao = teclado.nextLine();
        if (opcao.equalsIgnoreCase("s")) {
            opcao = teclado.nextLine();
                    car.ligar();
        }

        System.out.println("\nDeseja desligar o carro?  (s/n)");
        
String opcao2 = teclado.nextLine();
        if (opcao2.equalsIgnoreCase("s")) {
  opcao2 = teclado.nextLine();
            car.desligar();

        }

        teclado.close();

        
        car.status();
    
    }

          
    
}
