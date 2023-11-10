public class Comissionado extends Empregado {
    private double valorVenda;
    private double taxaComissao;

    public Comissionado (String nome, String cpf, double salario, double valorVenda, double taxaComissao){
        super(nome, cpf, salario);
        this.valorVenda = valorVenda;
        this.taxaComissao = taxaComissao;
    }

    public double getValorVenda(){
        return valorVenda;
    }

    public  void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }

    public double getTaxaComissao(){
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao){
        this.taxaComissao = taxaComissao;
    }

    public double calcularSalario(){
        return  getSalario() + (taxaComissao * valorVenda);
    }

    
}
