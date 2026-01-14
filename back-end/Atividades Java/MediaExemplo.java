import java.util.Scanner;

public class MediaExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double nota;
        int n = 1;

        while (n <= 5) {
            
            System.out.println("informe sua nota ");
            nota = scanner.nextDouble();

            soma = soma + nota;
            n = n +1;
        }
        System.out.println("sua média é" + soma / (n-1));
        scanner.close();

    }
    
}
