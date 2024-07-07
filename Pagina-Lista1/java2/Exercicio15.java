package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio15 {
    public static void main(String[] args) {
        double peso;
        double pesoma;
        double pesome;
        System.out.println("Insira o seu peso: ");
        Scanner entrada=new Scanner(System.in);
        peso=entrada.nextDouble();
        pesoma= peso*1.15;
        pesome=peso*0.80;
        System.out.println("O peso se engordar 15% sera de:" +pesoma);
        System.out.println("O peso se emagrecer 20% sera de:" +pesome);
    }
}
