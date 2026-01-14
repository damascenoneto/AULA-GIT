/*EX42 – Parque de Diversão
Nos parques de diversão, alguns brinquedos têm idade e altura mínimas
para poder andar neles. O parque possui 3 brinquedos que possuem essa
limitação:
* Barca Viking: 1,5m de altura e 12 anos.
* Elevator of Death: 1,4m de altura e 14 anos.
* Final Killer: 1,7m de altura ou 16 anos.
Dada a altura e a idade de uma pessoa, faça um programa que
identifique quantos brinquedos ele pode andar. */

import java.util.Scanner;

public class Parque {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            double barcaViking = 1.5;
            double elevatorOfDeath = 1.4;
            double finalKiller = 1.7;
            String continuar = "s";

            while(continuar.equals("s")){
             int contador = 0;
                System.out.print("\nInforme sua altura: ");
                double altura = scanner.nextDouble();
                System.out.println("Informe sua idade:\n");
                int idade = scanner.nextInt();

                if(altura >= barcaViking && idade >= 12){               
                contador += 1;
                }
                if(altura >= elevatorOfDeath && idade >= 14){               
                contador += 1;
                }
                if(altura >= finalKiller || idade >= 16){ 
                contador += 1;
                }
                System.out.println("Você pode utilizar: " + contador + " Brinquedos!");
                System.out.print("\nDeseja testar outra pessoa ? Digite S para continuar ou N para encerrar: ");
                continuar = scanner.next().toLowerCase();
            }
            System.out.println("\nFim do programa! ");
        }

    }
}