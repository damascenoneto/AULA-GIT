/*EX48 – Peso Ideal
Elabore um programa que permita receber o peso e a altura de uma
pessoa adulta. O programa deverá exibir uma das seguintes mensagens:
“Parabéns peso ideal”,
ALTURA                  PESO IDEAL
Até 1.50                    50 kg
De 1.51 até 1.90            70 kg
Acima de 1.91               100 kg
*/
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String continuar;
            do {
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();

                System.out.print("Informe o peso: ");
                double pesoAtual = scanner.nextDouble();

                double pesoIdeal;
                String faixaAltura;
                

                if (altura <= 1.50) {
                    pesoIdeal = 50.0;
                    faixaAltura = "Até 1.50m";
                }
                else if (altura <= 1.90) {
                    pesoIdeal = 70.0;
                    faixaAltura = "De 1.51m até 1.90m";
                }
                else {
                    pesoIdeal = 100.0;
                    faixaAltura = "Acima de 1.91m";
                }
                if (pesoAtual == pesoIdeal) {
                    System.out.println("Você está no peso ideal correspondente!");
                }
                else if (pesoAtual < pesoIdeal) {
                    double diferenca = pesoIdeal - pesoAtual;
                    System.out.printf("Você está abaixo do peso par sua faixa de Altura %s faixaAltura.Faltam %.3f Kg", faixaAltura, diferenca);
                }
                else {
                    double diferenca = pesoAtual - pesoIdeal;
                    System.out.printf("Você está acima do peso para faixa de Altura %s. Precisa perder %.3f Kg", faixaAltura, diferenca);
                }

                System.out.println("\nDeseja calcular o peso ideal de outra pessoa? (S/N): ");
                continuar = scanner.next();
                
                
            } while (continuar.equalsIgnoreCase("S"));
            System.out.println("Programa encerrado!");
            
        }
    }
}