public class Agenda {
    private Pessoa[] pessoas;
    private int qtde;

    public Agenda(int qtde){
        this.qtde = 0;
        this.pessoas = new Pessoa[qtde];
    }

    public boolean add(Pessoa p) {
        if (qtde == this.pessoas.length) return false;
        this.pessoas[qtde++] = p; 
        return true;
    }

    public String getNomeMaisNova(){
        if (this.qtde == 0) return null;
        Pessoa menor = this.pessoas[0];
        for (Pessoa p : this.pessoas){ 
            if (p.getIdade() < menor.idade)
                menor = p;
            
        }
        return menor.getNome();
        
    }
    public void getPessoasAgenda(){ 
        for(int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
            /*System.out.println(pessoas[i].getNome());
            System.out.println(pessoas[i].getIdade());*/
            
            System.out.println(pessoas[i].toString());
            }
        }
    }

}
