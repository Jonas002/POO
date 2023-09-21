import java.util.Scanner;
public class PrincipalFuncionario{
public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int cod = teclado.nextInt();
        int telefone = teclado.nextInt();
        int idade = teclado.nextInt();teclado.nextLine();
        String nome = teclado.nextLine();
        String end = teclado.nextLine();
        Double salario = teclado.nextDouble();teclado.nextLine();
        String email = teclado.nextLine();

        Funcionario fu = new Funcionario(cod, telefone, idade, nome, end, salario, email);
        System.out.println(fu.toString());
    }
}
