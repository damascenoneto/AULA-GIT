import java.util.Scanner;

public class CalculoLucro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        double valorVenda;
        double valorCusto;
        double lucroFinal = 0;
        
        while (contador <=5) {
            System.err.println("informe o valor de sua "+ contador + "venda");
            valorVenda = scanner.nextDouble();
            System.err.println("informe o valor de custo do produto");
            valorCusto = scanner.nextDouble();

            lucroFinal = lucroFinal + (valorVenda - valorCusto);
            contador = contador +1;
        }
        System.err.printf("o valor de seu lucro total é %.2f%n", lucroFinal);
        scanner.close();        
    }
}
