import java.lang.Math;
public class Aluno extends Pessoa{
    private String matricula;
    private int nota1, nota2;

    public Aluno(String nome, int idade, String telefone, String matricula, int nota1, int nota2){
        super(nome,idade,telefone);
        this.matricula = matricula;
        this.nota1 = nota1; 
        this.nota2 = nota2;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getNota1(){
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1  = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;

    }  

    public int calculanota() {
        return (nota1+nota2) / 2;
    }

    public String toString(){
        return super.toString() + "\nMatricula: " + matricula + "\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nMédia do aluno: " + calculanota();
    }


  



}
