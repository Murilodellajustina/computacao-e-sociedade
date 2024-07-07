package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio12 {
    public static void main(String[] args) {
        float valorkg;
        float Peso;
        float pesoprato;
        float pesototal;
        valorkg=(float) 39.00f;
        pesoprato=(float) 0.450f;
        System.out.println("Insira o peso que apareceu na balanca: ");
        Scanner entrada=new Scanner(System.in);
        Peso=entrada.nextFloat();
        pesototal=Peso-pesoprato;
        System.out.println("O valor a pagar e: R$"+pesototal*valorkg);
    }
}