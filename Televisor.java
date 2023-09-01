public class Televisor {
    //Atributos
    private int canal;
    private int volume;
    private boolean ligado;

    //Construtor
    public Televisor(int canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    //Métodos
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
        ligado = true;
    }        

    public void desligar(){
        ligado = false;
    }

    public void aumentarVolume(){
        volume = volume + 1;
    }

    public void diminuirVolume(){
        volume = volume - 1;
    }

    public void trocarCanal(){
        canal = canal + 1;
    }

    public void imprimir(){
        System.out.println(canal);
        System.out.println(volume);
        System.out.println(ligado);
    }

    public String toString(){
        String ligado = "Não";
        if (this.ligado==true){
        ligado = "sim";
    }
        return "canal:" + canal + " volume:" + volume + " ligado:" + ligado;
    } 
    



}
