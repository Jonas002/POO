public class FreteExpresso extends Frete implements Fretavel{
    private int nivelUrgencia;
    
    public FreteExpresso(float distancia, float valorPorKm, int nivelUrgencia){
        super(distancia, valorPorKm);
        this.nivelUrgencia = nivelUrgencia;
    }

    public int getNivelUrgencia(){
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia){
        this.nivelUrgencia = nivelUrgencia;
    }

    public float calcularFrete(){
        return (getDistancia() * getValorPorKm()) + (nivelUrgencia * 100);
    }
}
