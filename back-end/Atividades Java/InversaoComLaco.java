 /* EX39 – Inversão de Algarismos
Faça um programa que inverta um número inteiro com quatro algarismos
recebido via teclado. Importante: se o número dado for 3000 por exemplo
, o invertido dele deve ser 3 e não 0003.
 */
import java.util.Scanner;

public class InversaoComLaco {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int numero;
        
        while (true) {
            System.out.print("Informe um número de 4 algarismos: ");
            numero = scanner.nextInt();

            if (numero >= 1000 && numero <= 9999) {
                break;            
            }

            System.out.println("Número inválido! Digite um número com exatamente 4 algarismos.\n");
        }

        int invertido = 0;
        int temporaio = numero;

        // Inversão usando while
        while (temporaio > 0) {
            int digito = temporaio % 10;
            invertido = invertido * 10 + digito;
            temporaio /= 10;
        }

        System.out.println("Número invertido: " + invertido);


        }

        
    }
}