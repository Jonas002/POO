public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, int idade, String telefone, float salario){
        super(nome,idade,telefone, salario); 
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
}
