import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe um valor");
        int valor1 = scanner.nextInt();
        System.out.print("informe um valor");
        int valor2 = scanner.nextInt();
        System.out.print("informe um valor");
        int valor3 = scanner.nextInt();
        
        int auxiliar ; 

        if (valor1 > valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;            
        }
        if (valor2 > valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;            
        }
        if (valor1 > valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;            
        }
        System.out.println("a ordem crescente dos valores é"+ valor1 + ","+ valor2 +","+ valor3);
        scanner.close();
        








    }
}
