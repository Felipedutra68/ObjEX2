package EX2_EX1Pessoas;

/**
 *
 * @author ADM
 */
public class Pessoas {

    String nome;
    double idade, altura;
    
    public Pessoas (String m , double i, double a){
    
        this.nome=m ;
        this.idade=i;
        this.altura=a;
    
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Modelo: "+this.getNome());
        System.out.println("Ponta: "+ this.getIdade());
         System.out.println("Ponta: "+ this.getAltura());
        
    
    }

        public String getNome() {
            return nome;
        }

        public void setNome(String n) {
            this.nome = n;
        }

        public double getIdade() {
            return idade;
        }

        public void setIdade(double i) {
            this.idade = i;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double a) {
            this.altura = a;
        }
         

}





