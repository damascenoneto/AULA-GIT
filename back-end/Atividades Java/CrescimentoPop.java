/*EX38 – Crescimento Populacional
Supondo que a população de um país A seja recebido via teclado em uma
variável representando a população atual daquele país que possui uma
taxa anual de crescimento de 3% a.a. e que a população de um país B
seja recebida também e que tenha uma taxa anual de crescimento de
1,5% a.a., fazer um programa que calcule a quantidade de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantida essas taxas de crescimento. Observe
que a população do país A tem de ser inferior a do país B.
Entrada:
90000 (PopA)
200000 (PopB)
Saída
55 Anos

*/


import java.util.Scanner;

public class CrescimentoPop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a população do país A: ");
        double popA = scanner.nextDouble();

        System.out.print("Informe a população do país B: ");
        double popB = scanner.nextDouble();

        int anos = 0;

        while (popA < popB) {
            popA += popA * 0.03;
            popB += popB * 0.015;

            anos++;
        }
        System.out.println("\nSerão necessário " + anos + " anos para que isso aconteça.");
        scanner.close();


    }
}
