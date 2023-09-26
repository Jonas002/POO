/*import java.util.Scanner;

public class TestaVetor{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];
        System.out.print("Digite um número: ");
        numeros [0] = teclado.nextInt();
        System.out.print("Digite um número: ");
        numeros [1] = teclado.nextInt();
        System.out.print("Digite um número: ");
        numeros [2] = teclado.nextInt();
        System.out.print("Digite um número: ");
        numeros [3] = teclado.nextInt();

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i){
            System.out.println(numeros[i]);
        }
       
    }
}*/
   // Imprime os números em ordem decrescente

/*import java.util.Scanner;

public class TestaVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = teclado.nextInt();
        }

     
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}*/


import java.util.Scanner;

public class TestaVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] [] numeros = new int[2] [2];
        for (int linha = 0; linha < numeros.length; linha++) {
            for(int coluna = 0; coluna < numeros[linha].length; coluna++){
            System.out.printf("Digite o %d° número da %d° linha: ", coluna +1, linha +1);
            numeros[linha] [coluna] = teclado.nextInt();
        }
        }

        for (int linha = 0; linha < numeros.length; linha++) {
            System.out.println();
        

            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.printf("%2d°", numeros[linha] [coluna]);
            }
        }
    }

}
