package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char continuar;

        do {
            String nomeHospede;
            String tipoApartamento;
            int numeroDiarias;
            double valorDiaria, valorTotal;

            System.out.println("Informe o nome do hóspede:");
            nomeHospede = entrada.nextLine();

            do {
                System.out.println("Informe o tipo do apartamento utilizado (A, B ou C):");
                tipoApartamento = entrada.nextLine().toUpperCase();
            } while (!tipoApartamento.equals("A") && !tipoApartamento.equals("B") && !tipoApartamento.equals("C"));

            do {
                System.out.println("Informe o número de diárias utilizadas pelo hóspede (maior que zero):");
                numeroDiarias = entrada.nextInt();
            } while (numeroDiarias <= 0);

            switch (tipoApartamento) {
                case "A":
                    valorDiaria = 150.0;
                    break;
                case "B":
                    valorDiaria = 100.0;
                    break;
                case "C":
                    valorDiaria = 75.0;
                    break;
                default:
                    valorDiaria = 0.0;
                    break;
            }

            valorTotal = valorDiaria * numeroDiarias;

            System.out.println("Conta final de " + nomeHospede + ":");
            System.out.println("Tipo do apartamento utilizado: " + tipoApartamento);
            System.out.println("Número de diárias utilizadas: " + numeroDiarias);
            System.out.println("Valor total a pagar: R$" + valorTotal);

            System.out.println("Deseja continuar (S/N)?");
            continuar = entrada.next().toUpperCase().charAt(0);
            entrada.nextLine(); // Limpar o buffer do teclado

        } while (continuar == 'S');
    }

}