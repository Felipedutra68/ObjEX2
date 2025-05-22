package EX2_EX7_Circulo;

/**
 *
 * @author ADM
 */
public class Circulo {

    double raio; 
    
    public Circulo ( double r){
    
        this.raio=r ;
       
    
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Modelo: "+this.getRaio());
       
        
    }

    void area() {
     double s = Math.PI * (raio*raio);
    System.out.println("A area do circulo eh "+s);

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
  
    
    
    
    
}
