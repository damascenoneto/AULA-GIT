/*Encontrar o Maior Valor
Dado o array int[] numeros = {15, 8, 25, 3, 42};,
percorra-o e encontre o maior valor. Imprima o resultado no console. */
public class MaiorValorArray {
    public static void main(String[] args) {
        int[] numeros = { 15, 8, 25, 3, 42 };
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            int valorAtual = numeros[i];
            if (valorAtual > maior) {
                maior = valorAtual;
            }
        }
        System.out.println("O maior valor encontrado no array é: " + maior);

    }

}