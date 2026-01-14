public class MediaArray {
    public static void main(String[] args) {
        double[] notas = { 7.5, 9.0, 6.8 };
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        System.out.printf("A média das notas é: %.2f%n", media);
    }
}