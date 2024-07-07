package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercício4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int som1;
        System.out.println("Insira o primeiro numero");
        Scanner entrada=new Scanner(System.in);
        num1=entrada.nextInt();
        System.out.println("Insira o segundo numero");
        num2=entrada.nextInt();
        som1=num1+num2;
        System.out.println("A soma dos numeros e:"+som1);
        System.out.println("O quadrado da soma e:"+(som1*som1));
    }
    
}