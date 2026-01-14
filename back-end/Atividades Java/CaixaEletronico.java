import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("informe o número referente ao seu saque");
        int valor = entrada.nextInt();

        int valorOriginal = valor;

        int nota100 = valor / 100;
        valor = valor %100;
        int nota50 = valor / 50;
        valor = valor %50;
        int nota20 = valor / 20;
        valor = valor %20;
        int nota10 = valor / 10;
        valor = valor %10;
        int nota5 = valor / 5;
        valor = valor %5;
        int nota2 = valor / 2;
        valor = valor %2;
        int nota1 = valor;
        
        if (nota100 > 0) {
            System.out.println(nota100 + "nota(s) de R$100,00");
        }
        if (nota50 > 0) {
            System.out.println(nota50 + "nota(s) de R$50,00");
        }
        if (nota20 > 0) {
            System.out.println(nota20 + "nota(s) de R$20,00");
        }
        if (nota10 > 0) {
            System.out.println(nota10 + "nota(s) de R$10,00");
        }
        if (nota5 > 0) {
            System.out.println(nota5 + "nota(s) de R$5,00");
        }
        if (nota2 > 0) {
            System.out.println(nota2 + "nota(s) de R$2,00");
        }
        if (nota1 > 0) {
            System.out.println(nota1 + "nota(s) de R$1,00");
        }
        entrada.close();
    }
    
}
