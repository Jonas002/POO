package exercicio;
public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Professor l = new Professor("Barros", "POO", 2023);
    l.setNomeProf("Barros");
    String nomeprof = l.getNomeProf();
    l.setNomeDep("POO");
    String nomedep = l.getNomeDep();
    l.setMatricula(2023);
    int matricula = l.getMatricula();

    l.imprimir();

    System.out.println(l.toString());

    }
}
