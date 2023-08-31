public class Quadrado{
    private double lado;

    //Construtor 
    public  Quadrado(double lado){
    this.lado = lado;
    }

    //Métodos
    public double calcularArea(){
        return lado*lado;
    }

    public double calcularPerimetro(){
        return 4*lado;
    }

    //Imprimir
    public void imprimir(){
        System.out.println(lado);
        System.out.println(calcularArea());
        System.out.println(calcularPerimetro());    
    }

    //Tostring
    public String toString(){
        return "Valor do lado:" + lado + " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro();
    }

}       