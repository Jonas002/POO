//1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]. 
public class Vetor{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

        System.out.println("Vetor A: ");
        for (int element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (int element : b){
            System.out.println(element + " ");
        }


    }
}

//2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2. 
public class Vetor{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i] * 2;
        }

        System.out.println("Vetor A: ");
        for (int element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (int element : b){
            System.out.println(element + " ");
        }


    }
}

//3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I]. 
public class Vetor{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i] * a[i];
        }

        System.out.println("Vetor A: ");
        for (int element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (int element : b){
            System.out.println(element + " ");
        }


    }
}

//4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]). 
import java.lang.Math;
public class Vetor{
    public static void main(String[] args){
        double[] a = {1,2,3,4,5};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = Math.sqrt(a[i]);
        }

        System.out.println("Vetor A: ");
        for (double element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (double element : b){
            System.out.println(element + " ");
        }


    }
}

//5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i. 
import java.lang.Math;
public class Vetor{
    public static void main(String[] args){
        double[] a = {1,2,3,4,5};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i] * i;
        }

        System.out.println("Vetor A: ");
        for (double element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (double element : b){
            System.out.println(element + " ");
        }
    }
}

//6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i]. 
import java.lang.Math;
public class Vetor{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10}; 
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("Vetor A: ");
        for (int element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (int element : b){
            System.out.println(element + " ");
        }

        System.out.println("Vetor C: ");
        for (int element : c){
            System.out.println(element + " ");
        }
    }
}

//7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i]. 
import java.lang.Math;
public class Vetor{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5, 15};
        int[] b = {6,7,8,9,10, 11}; 
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i] - b[i];
        }

        System.out.println("Vetor A: ");
        for (int element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (int element : b){
            System.out.println(element + " ");
        }

        System.out.println("Vetor C: ");
        for (int element : c){
            System.out.println(element + " ");
        }
    }
}

//8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i].
import java.lang.Math;
public class Vetor{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5, 15};
        int[] b = {6,7,8,9,10, 11}; 
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i] * b[i];
        }

        System.out.println("Vetor A: ");
        for (int element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (int element : b){
            System.out.println(element + " ");
        }

        System.out.println("Vetor C: ");
        for (int element : c){
            System.out.println(element + " ");
        }
    }
}

//9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).
import java.lang.Math;
public class Vetor{
    /**
     * @param args
     */
    public static void main(String[] args){
        float[] a = {1,2,3,4,5, 15};
        float[] b = {6,7,8,9,10, 11}; 
        float[] c = new float[a.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i] / (b[i]);
        }

        System.out.println("Vetor A: ");
        for (float element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (float element : b){
            System.out.println(element + " ");
        }

        System.out.println("Vetor C: ");
        for (float element : c){
            System.out.println(element + " ");
        }
    }
}

//10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2. 
import java.lang.Math;
public class Vetor{
    public static void main(String[] args){
        double[] a = {1,2,3,4,5};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i] % 2;
        }

        System.out.println("Vetor A: ");
        for (double element : a){
            System.out.println(element + " ");
        }

        System.out.println("Vetor B: ");
        for (double element : b){
            System.out.println(element + " ");
        }
    }
}

//11.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares. 
