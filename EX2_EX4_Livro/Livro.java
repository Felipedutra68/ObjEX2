package EX2_EX4_Livro;

/**
 *
 * @author ADM
 */
public class Livro {

    String titulo;
    String autor;
    int ano;
    boolean disponivel;
    
     public Livro (String t , String au, int a){
    
        this.titulo=t ;
        this.autor=au;
        this.ano=a;
    
    }
    
     public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Modelo: "+this.getTitulo());
        System.out.println("Ponta: "+ this.getAutor());
         System.out.println("Ponta: "+ this.getAno());
         
    }
     
     void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro " + titulo + " emprestado com sucesso");
        } else {
            System.out.println("Livro " + titulo + " nao enta disponivel para emprestimo");

        }

    }

    void devolver() {
        if (!disponivel) {
            disponivel = true;

            System.out.println("Livro " + titulo + " devolvido com sucesso");
        } else {

            System.out.println("Livro "+titulo+" ja esta disponivel");
            
            
            
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
     
    
    
    
}
