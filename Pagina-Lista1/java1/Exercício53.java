package exercício5.pkg3;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercício53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        String endereco;
        int telefone;
        System.out.println("Digite seu nome");
        Scanner entrada = new Scanner(System.in);
        nome=entrada.nextLine();
        System.out.println("Digite seu endereco");
        endereco=entrada.nextLine();
        System.out.println("Digite seu telefone");
        telefone=entrada.nextInt();
        System.out.println("O seu nome e:"+nome);
        System.out.println("O seu endereco e:"+endereco);
        System.out.println("O seu telefone e:"+telefone);
    }
    
}
