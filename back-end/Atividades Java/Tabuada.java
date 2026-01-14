import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int numeroTabuada;
        System.err.println("informe um número que você quer gerar a tabuada");
        numeroTabuada = scanner.nextInt();


        while (contador <=10) {
            System.err.println(numeroTabuada + " x " + contador + " = " + numeroTabuada * contador);
            contador = contador +1;
        }
    }
}
