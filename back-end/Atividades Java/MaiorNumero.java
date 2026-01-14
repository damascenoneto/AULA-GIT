import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe um valor");
        int valor1 = scanner.nextInt();
        System.out.print("informe um valor");
        int valor2 = scanner.nextInt();
        System.out.print("informe um valor");
        int valor3 = scanner.nextInt();

        int maior = valor1;
        int menor = valor1;


        if (valor2 > valor1 ) {   
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;            
        }
        if (valor2 < menor) {
            menor = valor2;            
        }
        if (valor3 < menor) {
            menor = valor3;
        }
        System.out.println("o maior número é " + maior);
        System.out.println("o menor número é "+ menor);
        scanner.close();
    

    }
}
