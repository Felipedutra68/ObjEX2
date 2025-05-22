package Ex2_EX6_Retangulo;

/**
 *
 * @author ADM
 */
public class Retangulo {
    
    double base;    
double altura;   

public Retangulo (double b ,  double a){
    
        this.base=b ;
        this.altura=a;
       
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Base: "+this.getBase());
        System.out.println("Altura: "+ this.getAltura());
        
        
    }

    void area() {
     double s =altura * base;
    System.out.println("A area do retangulo eh "+s);

    }

    void perimetro() {
    double p = (altura+base)*2;    
System.out.println("O perimetro do retangulo eh "+p);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    

}
