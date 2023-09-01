public class Funcionario {
    private int cod, tel, idade;
    private String nome, end, cpf;
    private double salario;

    //Construtor

    public Funcionario(int cod, int tel, int idade, String nome, String end, double salario, String cpf){
        this.cod = cod;
        this.cpf = cpf;
        this.tel = tel;
        this.idade = idade;
        this.nome = nome;
        this.end = end;
        this.salario = salario;
    }

    //Métodos
    public int getCod(){
        return cod;
    }

    public void setCod(int cod){
        this.cod = cod;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getTel(){
        return tel;
    }

    public void setTel(int tel){
        this.tel = tel;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEnd(){
        return end;
    }

    public void setEnd(String end){
        this.end = end;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public float calculaSalarioLiquido(){
        return (float) (salario - salario * 0.11f);
    }

    public String toString(){
        return "Código: " + cod + "\nNome: " + nome +"\nCPF: " + cpf + "\nEndereço: " + end + "\nTelefone: " + tel + "\nIdade: " + idade + "\nSalário:R " + salario  + "\nSalário com desconto:R$" + calculaSalarioLiquido();
    }

}
