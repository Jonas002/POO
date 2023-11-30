public abstract class Frete {
    private float distancia;
    private float valorPorKm; 

    public Frete(float distancia, float valorPorKm){
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
    }

    public float getDistancia(){
        return distancia;
    }

    public void setDistancia( float distancia){
        this.distancia = distancia;
    }

    public float getValorPorKm(){
        return valorPorKm;
    }

    public void setValorPorKm(float valorPorKm){
        this.valorPorKm = valorPorKm;
    }

}
