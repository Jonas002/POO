public class Pessoa {
    private String nome;
    int idade;
    private String telefone;

    public Pessoa(String nome, int idade, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\n Telefone:" + telefone;
    }

}
