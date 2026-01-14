/*Criação e Impressão de Elementos Crie um array de inteiros com 5
posições. Atribua um valor a cada posição e, em seguida, imprima o
valor do elemento no índice 2 e o do último elemento. */

public class ElementoLista {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Elemento no índice 2: "+ + numeros[2]);

        int ultimoElementos = numeros.length -1;

        System.out.println("Último elemento tem índice: " + ultimoElementos + " Seu valor é: " + numeros[ultimoElementos]);

    }
}