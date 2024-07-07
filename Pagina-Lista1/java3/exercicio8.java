package lista.pkg2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double tempo;
       double perigo;
       Scanner entrada=new Scanner(System.in);
        System.out.println("Insira o tempo em que você levou para escutar o som do trovao após ver o raio atingir o chão");
        tempo=entrada.nextDouble();
        perigo=tempo*340;
        if (perigo<200)
            System.out.println("Voce correu perigo");
        else 
            System.out.println("Voce nao correu perigo");
    }
    
}
