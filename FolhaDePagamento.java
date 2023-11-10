public class FolhaDePagamento {
    private Empregado[] Assalariado;
    private int qtdAssalariado = 0;
    

    public FolhaDePagamento() {
        Assalariado = new Empregado[10];
    }

    public void adicionar(Empregado p) {
        if(qtdAssalariado < Assalariado.length) {
            Assalariado[qtdAssalariado] = p;
            qtdAssalariado++;
        }

    }

    public double calcularTotal() { 
        double totalSalario = 0;
        for (int i=0;i<qtdAssalariado;i++) {
            totalSalario += Assalariado[i].calcularSalario();
        }
        return totalSalario;
    }

    public void imprimirTotal() {
        System.out.println("O Total da folha de pagamento é: " + calcularTotal());
    }
    


    
}
