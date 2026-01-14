import java.util.Scanner;

public class ConversaoAnoMesDia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe sua idade em dias");
        int dias = entrada.nextInt();
        


        int diasTotais = dias;

        int ano = dias / 365;
        dias = dias % 365;
        int mes = dias / 30;
        dias = dias %30;
        int dia = dias;

        if (ano > 0) {
            System.out.println(ano + " ano(s)");     
        }
        if (mes > 0) {
            System.out.println(mes + " mês(e5s)");     
        }
        if (dia > 0) {
            System.out.println(dia + " dia(s)");     
        }
        entrada.close();
    }
}
