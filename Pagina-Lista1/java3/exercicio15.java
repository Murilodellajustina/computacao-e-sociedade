package lista.pkg2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    double salarioB;
    double INSS;
    double impostoR;
    double salarioL;
    System.out.println("Insira o salario bruto:");
    salarioB=entrada.nextDouble();
    INSS=salarioB*0.11;
    impostoR=salarioB*0.15;
    salarioL=salarioB-INSS-impostoR;
        System.out.println("O salario liquido e: "+(salarioL+150.00));
    }
    
}