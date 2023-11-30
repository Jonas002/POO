public class FreteSuperExpresso extends FreteExpresso{
    private double valorDoSeguro;

    public FreteSuperExpresso(float distancia, float valorPorKm, int nivelUrgencia, double valorDoSeguro){
        super(distancia, valorPorKm, nivelUrgencia);
        this.valorDoSeguro = valorDoSeguro;
    }

    public double getValorDoSeguro(){
        return valorDoSeguro;
    }

    public void setValorDoSeguro(int valorDoSeguro){
        this.valorDoSeguro = valorDoSeguro;
    }

    public float calcularFrete(){
        return (float)((getDistancia() * getValorPorKm()) + (getNivelUrgencia() * 100) + valorDoSeguro);
    }

    
}
