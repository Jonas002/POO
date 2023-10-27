public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, int idade, String telefone, float salario, String disciplina){
        super(nome,idade,telefone, salario); 
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public  void seViraNos30() {
        System.out.println("Se vira nos 30");
    }
}
