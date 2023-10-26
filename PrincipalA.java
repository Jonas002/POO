import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomealuno = teclado.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idadealuno = teclado.nextInt();teclado.nextLine();
        System.out.print("Digite o número do aluno: ");
        String telefonealuno = teclado.nextLine();
        System.out.print("Digite a matricula do aluno: ");
        String mataluno = teclado.nextLine();
        int nota1 = teclado.nextInt();teclado.nextLine();
        int nota2 = teclado.nextInt();teclado.nextLine();
        
        
        Aluno p1 = new Aluno (nomealuno, idadealuno, telefonealuno, mataluno, nota1, nota2);
        /*System.out.print("Digite o nome do aluno: ");
        String nomealuno1 = teclado.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idadealuno2 = teclado.nextInt();teclado.nextLine();
        System.out.print("Digite o número do aluno: ");
        String telefonealuno3 = teclado.nextLine();
        System.out.print("Digite a matricula do aluno: ");
        String mataluno4 = teclado.nextLine();
        Aluno p2 = new Aluno(nomealuno1, idadealuno2, telefonealuno3, mataluno4, 100, 100);
        Funcionario p4 = new Professor("Peu", 18, "(83)981535148", 3000);
        Pessoa p5 = new Professor("Barros", 39, "(83)998405985", 3050);*/

        System.out.println(p1.toString());
        
        


        /*cad.adicionar(p1);

        cad.quadroSeViraNos30();*/ 
    }
}
