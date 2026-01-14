/*
 * EX39 – Inversão de Algarismos
Faça um programa que inverta um número inteiro com quatro algarismos
recebido via teclado. Importante: se o número dado for 3000 por exemplo
, o invertido dele deve ser 3 e não 0003.
 */
import java.util.Scanner;

public class InversaoAlgarismos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe um número inteiro com 4 algarismos: ");
            int numero = scanner.nextInt();
            int milhar = numero / 1000;
            int centena = (numero / 100) % 10;
            int dezena = (numero / 10) % 10;
            int unidade = numero % 10;
            int invertido = unidade * 1000 + dezena * 100 + centena * 10 + milhar;
            System.out.println("Número invertido: " + invertido);
        
        }
        
    }
}