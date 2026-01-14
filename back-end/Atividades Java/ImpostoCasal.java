import java.util.Scanner;

public class ImpostoCasal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a renda do homem");        
        double rendaHomem = entrada.nextDouble();
        System.out.println("informe a renda da mulher");
        double rendaMulher = entrada.nextDouble();

        double rendaConjunta = rendaHomem + rendaMulher;
        double percentualImposto;
        double valorImposto ; 
        double rendaLiquida ; 

        if (rendaConjunta <=900) {
            percentualImposto = 0;            
        }else if (rendaConjunta <= 1500) {
            percentualImposto = 0.10;                       
        }else if (rendaConjunta <= 2500) {
            percentualImposto = 0.15;
        }else{
            percentualImposto = 0.25;
        }

        valorImposto = rendaConjunta * percentualImposto;
        rendaLiquida = rendaConjunta - valorImposto;

        System.out.printf("renda conjunta : %.2f%n", rendaConjunta);
        System.out.printf("Percentual do imposto: %.2f%n", percentualImposto*100);
        System.out.printf("valor do imposto a pagar: %.2f%n", valorImposto);
        System.out.printf("a renda liquida é : %.2f%n", rendaLiquida);

        entrada.close();




    }
}
