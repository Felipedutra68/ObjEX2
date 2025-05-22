package EX2_EX3_Carro;

/**
 *
 * @author ADM
 */
public class Carro {

    String marca;
    String modelo;
    int ano;
    boolean Ligado;

    public Carro(String m, String mo, int a) {

        this.marca = m;
        this.modelo = mo;
        this.ano = a;
        this.setLigar(true);
    }

    public void status() {

        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Madelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Ele esta ligado: " + this.getLigar());

    }

    void ligar() {
        if (Ligado) {
            Ligado = false;
            System.out.println("O carro " + marca + " modelo " + modelo + " ja esta ligado");
        } else {
            System.out.println("O carro " + marca + " modelo " + modelo + " foi ligado");

        }

    }

    void desligar() {
        if (!Ligado) {
            Ligado = true;

            System.out.println("O carro " + marca + "" + modelo + " foi desligado");
        } else {

            System.out.println("O carro " + marca + "" + modelo + " ja esta desligado");

        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getLigado() {
        return Ligado;
    }

    public void setLigado(boolean Ligado) {
        this.Ligado = Ligado;
    }

    public boolean getLigar() {
        return Ligado;
    }

    public void setLigar(boolean Ligar) {
        this.Ligado = Ligado;
    }

}
