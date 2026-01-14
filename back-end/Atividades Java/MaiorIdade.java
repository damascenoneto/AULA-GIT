/*EX34 – Maior Idade
Elabore um programa que receba idades de pessoas via teclado.
Encerrar o recebimento quando receber uma idade com valor igual a 100,
esta não deverá entrar nos cálculos. Ao final exibir a maior idade
recebida */

import java.util.Scanner;

public class MaiorIdade {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int menorIdade = 201;
        int maiorIdade = -1;

        while (true) { 
            System.out.print("Informe sua idade: ");
            idade = scanner.nextInt();
            if (idade == 100) {
                break;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
                        
        }
        if (maiorIdade == -1) {
            System.out.println("Nenhuma idade válida foi informado.");
        } else {
            System.out.println("Menor Idade " + menorIdade + "anos");
            System.out.println("Maior Idade " + maiorIdade + "anos");
        }
        scanner.close();

    }
}