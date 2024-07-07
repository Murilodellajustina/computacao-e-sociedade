package exercício.pkg8;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercício8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero1;
    int numero2;
    int numero3;
    int numero4;
    int quad1;
    int quad2;
    int quad3;
    int quad4;
     System.out.println("Insira o primeiro numero");
     Scanner entrada=new Scanner(System.in);
      numero1=entrada.nextInt();
      System.out.println("Insira o segundo numero");
      numero2=entrada.nextInt();
      System.out.println("Insira o terceiro numero");
      numero3=entrada.nextInt();
      System.out.println("Insira o quarto numero");
      numero4=entrada.nextInt();
      quad1=numero1*numero1;
      quad2=numero2*numero2;
      quad3=numero3*numero3;
      quad4=numero4*numero4;
      System.out.println("O resultado da operacao e:"+(quad1+quad2+quad3+quad4));
    }
    
}
