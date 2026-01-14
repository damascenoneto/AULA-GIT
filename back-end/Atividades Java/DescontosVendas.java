import java.util.Scanner;

public class DescontosVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o valor da compra");
        double compra = scanner.nextDouble();
        double compraDesconto;

        if (compra > 500){
            double desconto = compra * 0.10;
            compraDesconto = compra - desconto ;
            System.out.printf("desconto de 10%% aplicado, total a pagar : RS %.2f%n", compraDesconto);

        }
            else {
            compraDesconto = compra;
            System.out.printf("o item não tem desconto, compra abaixo dos 500 reais, não foi possível aplicar no seu valor ");
            
        }
        scanner.close();



        }
    
    
}
