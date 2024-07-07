package lista.pkg2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int a;
    int b;
        System.out.println("Insira o numero A: ");
        a=entrada.nextInt();
        System.out.println("Insira o numero B");
        b=entrada.nextInt();
        if (a==b)
            System.out.println("Os números sao iguais");
        else
            System.out.println("Os numeros nao sao iguais");
    }
    
}