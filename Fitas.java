
public class Fitas{
    private String titulo;
    private double precoAlug;

    public Fitas(String titulo, int precoAlug){
        this.titulo = titulo;
        this.precoAlug = precoAlug;
    }

    //Métodos
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public double getPrecoAlug(){
        return precoAlug;
    }

    public void setPrecoAlug(int precoAlug){
        this.precoAlug = precoAlug;
    }

    public double getvalorAluguel(int numeroDeDiasALugada){
        return (numeroDeDiasALugada * precoAlug);
    }

    public String toString(){
        return "Filme: " + titulo +  "\nPreço do Aluguel: " +  precoAlug;
    }
}