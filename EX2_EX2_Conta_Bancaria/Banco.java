package EX2_EX2_Conta_Bancaria;

/**
 *
 * @author ADM
 */
public class Banco {

    
    String titular;
    double conta, saldo;
 
    public Banco (String t , double c, double s){
    
        this.titular=t ;
        this.conta=c;
        this.saldo=s;
    
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Modelo: "+this.getTitular());
        System.out.println("Ponta: "+ this.getConta());
         System.out.println("Ponta: "+ this.getSaldo());
        
    
    }

    void depositar (double valor){
    saldo += valor;
    System.out.println("Deposito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+saldo);
    
}
    
    
    
    
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
}
