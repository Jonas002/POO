import java.util.Scanner;
    public class AulaVetor{
        
        public static void main(String[]args){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a capacidade da agenda: ");
            int capacidade = teclado.nextInt();teclado.nextLine();
            Agenda agenda = new Agenda(capacidade);
            String nome, telefone;
            int idade;

            for (int i = 0; i < capacidade; i++){
                System.out.println("Digite seu nome: ");
                nome = teclado.nextLine();
                System.out.println("Digite sua idade: ");
                idade = teclado.nextInt();teclado.nextLine();
                System.out.println("Digite seu número: ");
                telefone = teclado.nextLine();
                
                agenda.add(new Pessoa(nome, idade, telefone));

                
               
            }

            System.out.println(agenda.getNomeMaisNova());
            agenda.getPessoasAgenda();
            
           

          
        }

        
}
