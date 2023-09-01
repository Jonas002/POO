public class circulo {
    private double raio;

    public circulo (double raio){
        this.raio = raio;
    }
 public double calcularArea(){
    return 3.14*raio*raio;
 }    
 public double calcularPerimetro(){
    return 2*3.14*raio;
 }
 public void imprimir(){
    System.out.println(raio);
    System.out.println(calcularArea());
    System.out.println(calcularPerimetro());
 }
}
