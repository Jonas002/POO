public class Funcionario extends Pessoa{
    private float salario;

    public Funcionario(String nome, int idade, String telefone, float salario){
        super(nome, idade, telefone);
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

}
