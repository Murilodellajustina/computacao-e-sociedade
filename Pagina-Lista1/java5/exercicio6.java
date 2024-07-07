package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        int quantidadeOtimo = 0;
        int somaIdadeRuim = 0;
        int quantidadeRuim = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Resposta do espectador " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
           System.out.print("Opinião em relação ao filme (Ótimo, Bom, Regular, Ruim): ");
            String opiniao = scanner.next();

            if (opiniao.equalsIgnoreCase("Ótimo")) {
                quantidadeOtimo++;
            } else if (opiniao.equalsIgnoreCase("Ruim")) {
                somaIdadeRuim += idade;
                quantidadeRuim++;
            }
        }

        double mediaIdadeRuim = 0;
        if (quantidadeRuim > 0) {
            mediaIdadeRuim = (double) somaIdadeRuim / quantidadeRuim;
        }

        int diferencaIdade = maiorIdade - menorIdade;

        System.out.println("Quantidade de respostas Ótimo: " + quantidadeOtimo);
        System.out.println("Média de idade das pessoas que responderam Ruim: " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa de maior idade e a de menor idade que responderam o questionário: " + diferencaIdade);
    }
    
}