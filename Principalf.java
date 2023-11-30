public class Principal {
    public static void main(String[] args) {
        CadastroFrete cadastro = new CadastroFrete();

        FretePadrao fretePadrao = new FretePadrao(100, 10);
        FreteExpresso freteExpresso = new FreteExpresso(150, 15, 2);
        FreteSuperExpresso freteSuperExpresso = new FreteSuperExpresso(200, 20, 3, 50);

        cadastro.adicionarFrete(fretePadrao);
        cadastro.adicionarFrete(freteExpresso);
        cadastro.adicionarFrete(freteSuperExpresso);

        System.out.println("Valor total dos fretes cadastrados: R$ " + cadastro.calcularValorTotal());
    }
}
