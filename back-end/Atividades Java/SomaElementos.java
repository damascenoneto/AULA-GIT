/*Soma de Elementos Crie um array de números inteiros com 4 valores.
Usando um laço de repetição (for ou for-each), calcule a soma de
todos os elementos e imprima o resultado. */

public class SomaElementos {
    public static void main(String[] args) {
        int [] valores = {5, 10, 15, 20};
        int soma = 0;
        for (int temp : valores) {
            soma+= temp;
            System.out.println("Adicionado: " + temp + " | Soma atual: " + soma);
            
        }
        System.out.println("A soma de todos elementos do array é: " + soma);
    }
    
}