public class Main2 {
    public static void main(String[] args) {
        FolhaDePagamento f = new FolhaDePagamento();
        // Cria um funcionario e adiciona a folha de pagamento
        Horista h1 = new Horista("Barros", "123.456.789-00", 3000.00, 200, 100);

        Comissionado c1 = new Comissionado("Jonas", "987.654.321-00", 2000.00, 50, 30);

        Mensalista m1 = new Mensalista("Heliane", "009.292.090-80", 10000.00, 10);
        f.adicionar(h1);
        f.adicionar(c1);
        f.adicionar(m1);



        f.imprimirTotal();
        
        
        // Calcula o salário do funcionario
        
    }
    
}
