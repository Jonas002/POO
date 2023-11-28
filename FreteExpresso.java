public class FreteExpresso {
    private float distancia;
    private float valorPorKm;
    private int nivelUrgencia;
    
    public float calcularFrete(){
        return (distancia * valorPorKm) + (nivelUrgencia * 100);
    }
}
