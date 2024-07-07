package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cpf;
        double rendaMensal, desconto;
        char classeRenda;

        do {
            System.out.println("Informe o CPF do contribuinte (ou '00' para sair):");
            cpf = entrada.nextLine();

            if (cpf.equals("00")) {
                break;
            }

            System.out.println("Informe a renda mensal do contribuinte:");
            rendaMensal = entrada.nextDouble();

            System.out.println("Informe a classe de renda do contribuinte (A, B, C, D ou E):");
            classeRenda = entrada.next().toUpperCase().charAt(0);

            switch (classeRenda) {
                case 'A':
                    desconto = 0;
                    break;
                case 'B':
                    desconto = rendaMensal * 0.05;
                    break;
                case 'C':
                    desconto = rendaMensal * 0.10;
                    break;
                case 'D':
                    desconto = rendaMensal * 0.15;
                    break;
                case 'E':
                    desconto = rendaMensal * 0.20;
                    break;
                default:
                    desconto = 0;
                    System.out.println("Classe de renda inválida.");
                    break;
            }

            System.out.println("CPF: " + cpf);
            System.out.println("Classe de renda: " + classeRenda);
            System.out.println(
                    "Alíquota de desconto: " + (desconto > 0 ? (int) (desconto / rendaMensal * 100) + "%" : "isento"));
            System.out.println("Valor a ser descontado: R$" + desconto);

            entrada.nextLine(); // Limpa o buffer do teclado

        } while (!cpf.equals("00"));

    }

}
