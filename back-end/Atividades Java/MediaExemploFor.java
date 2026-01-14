import java.util.Scanner;

public class MediaExemploFor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double nota;
        int contador = 5;

        for (int i = 1; i <= contador; i ++){
            System.out.println("informe a sua " + i + "a nota:");
            nota = scanner.nextDouble();
            soma = soma + nota; // ou soma += nota;


        }
        System.out.println("a média de suas notas é " + soma / contador);
        scanner.close();
    }
    
}
