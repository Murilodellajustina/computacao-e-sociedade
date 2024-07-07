package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int bilhetesCrianca = 0;
        int bilhetesNormal = 0;
        int bilhetesMeiaIdade = 0;
        String continuar;

        do {
            System.out.println("Informe a idade do visitante:");
            int idade = entrada.nextInt();

            if (idade < 6) {
                System.out.println("O visitante é isento de pagamento.");
            } else if (idade >= 6 && idade <= 12) {
                System.out.println("O visitante deve comprar um bilhete de criança.");
                bilhetesCrianca++;
            } else if (idade >= 13 && idade <= 65) {
                System.out.println("O visitante deve comprar um bilhete normal.");
                bilhetesNormal++;
            } else {
                System.out.println("O visitante deve comprar um bilhete de meia idade.");
                bilhetesMeiaIdade++;
            }

            System.out.println("Deseja informar a idade de outro visitante? (sim/não)");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Bilhetes vendidos:");
        System.out.println("Criança: " + bilhetesCrianca);
        System.out.println("Normal: " + bilhetesNormal);
        System.out.println("Meia Idade: " + bilhetesMeiaIdade);

    }

}