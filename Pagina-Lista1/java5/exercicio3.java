package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         int repeticoes = 0;
         String nome;
         int idade;
         String sexo;
         while (true) {
         System.out.print("Digite o nome da pessoa (ou '0' para encerrar): ");
         nome=entrada.nextLine();
         if (nome.equals("0")) {
             break;
         }
         System.out.print("Digite a idade da pessoa: ");
         idade=entrada.nextInt();
         if (idade == 0) {
             break; 
         }
          System.out.print("Digite o sexo da pessoa: ");
          sexo=entrada.nextLine();
          repeticoes++; 
         }
          System.out.println("O algoritmo foi repetido " + repeticoes + " vezes.");
    }
    
}