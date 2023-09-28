import java.util.Scanner;
    public class AulaVetor{
        
        /**
         * @param args
         */
        public static void main(String[]args){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = teclado.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();teclado.nextLine();

            Pessoa[] pessoas = new Pessoa[5];
            pessoas[0] = new Pessoa(nome, idade);

            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Digite sua idade: ");
            idade = teclado.nextInt();teclado.nextLine();
            pessoas[1] = new Pessoa(nome, idade);
            for(int i = 0; i < pessoas.length; i++) {
                if (pessoas[i] != null) {
                    System.out.println(pessoas[i].getNome());

                }
            }


            System.out.println("Hello word");
        }
}