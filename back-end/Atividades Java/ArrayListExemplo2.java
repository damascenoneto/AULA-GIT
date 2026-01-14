import java.util.ArrayList;

public class ArrayListExemplo2 {
    public static void main(String[] args) {
        double [] notas = {8.5, 7.0, 9.2, 6.5, 7.0, 10.};
        // --- 1. contar quantas vezes a nota 7.0 aparece

        int contadorSete = 0;
        for(double nota: notas){
            if (nota == 7.0) {
            contadorSete ++;
        }
        }
        System.out.println(" A nota 7.0 aparece " + contadorSete + " vez(es) na lsita.");

        // 2. Encontrar o índice da primeira ocorrência da nota 9.2
        for (int i = 0; i < notas.length; i++){
            if (notas[i] == 9.2) {
                System.out.println("O índice da primeira ocorrência da nota 9.2 é: " + i);
                break;
            }
        }
        
    }
}