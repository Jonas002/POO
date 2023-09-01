package exercicio;
public class Professor {
    
    //Atributos
    private String nomeprof;
    private String nomedep;
    private int matricula;

    //Construtor
    public Professor(String nomeprof, String nomedep, int matricula){
        this.nomeprof = nomeprof;
        this.nomedep = nomedep;
        this.matricula = matricula;

    }

    //Métodos
    public String getNomeProf(){
        return nomeprof;
    }

    public void setNomeProf(String nomeprof){
        this.nomeprof = nomeprof;
    }

    public String getNomeDep(){
        return nomedep;
    }

    public void setNomeDep(String nomedep){
        this.nomedep = nomedep;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void imprimir(){
        System.out.println(nomeprof);
        System.out.println(nomedep);
        System.out.println(matricula);
    }

    
        return "NomeProf:" + nomeprof + " NomeDep:" + nomedep + " Matricula:" + matricula;
    }

    
}    

