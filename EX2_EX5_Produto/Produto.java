package EX2_EX5_Produto;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Produto {

    String nome;
    double preco;
    int Quantidade;

      int NST;
    
    public Produto (String n , double p, int q){
    
        this.nome=n ;
        this.preco=p;
        this.Quantidade=q;
    
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Produto: "+this.getNome());
        System.out.println("Preco: "+ this.getPreco());
         System.out.println("Quantidade em estoque: "+ this.getQuantidade());

        
    }
    
    void Adicionar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o quanto voce quer a dicionar ao estoque");
        int por = teclado.nextInt();

        NST = por + Quantidade;

      

        System.out.println("A nova quantidade em etoque eh " + NST);

    }
        
         void remover() {
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Digite o quanto voce quer a dicionar ao estoque");
        double por1 = teclado2.nextDouble();
        
        if(por1 > NST) {

           System.out.println("O estoque nao tem a quantidade requerida");

         }
 double NST1 = NST - por1;
        System.out.println("A nova quantidade em etoque eh " + NST1);
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
  
         
}
