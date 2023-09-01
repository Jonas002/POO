public class Porta {
    //Atributos
    private String cor;
    private int altura;
    private int largura;
    private boolean estaAberta;
    
    //Construtor
    public Porta(String cor, int altura, int largura, boolean estaAberta){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
        
    }

    //Metodos
    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getLargura(){
        return largura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public boolean getEstaAberta(){
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }

    public void imprimir(){
        System.out.println(cor);
        System.out.println(altura);
        System.out.println(largura);
        System.out.println(estaAberta);
    }

    public String toString(){
        String aberta = "Não";
        if(estaAberta == true){
        aberta = "Sim";           
    }
        return "cor:" + cor + " altura:" + altura + " largura:" + largura + " estaAberta:" + estaAberta;
    }

}