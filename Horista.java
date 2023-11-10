public class Horista extends Empregado {
    private double precoHora;
    private double horasTrabalhadas;
    
    public Horista(String nome, String cpf, double salario, double precoHora, double horasTrabalhadas){
        super(nome, cpf, salario);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHora(){
        return precoHora;
    }

    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        return  getSalario() + (precoHora * horasTrabalhadas);
    }


}
